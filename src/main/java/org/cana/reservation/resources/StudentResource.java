package org.cana.reservation.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.cana.reservation.model.Student;
import org.cana.reservation.service.StudentService;

@Path("/students")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class StudentResource {
	
	private StudentService studentService = new StudentService();
	
	@GET
	public List<Student> getStudents(){
		return studentService.getAllStudents();
	}
	
	@POST
	public Student addStudent(Student student){
		return studentService.addStudent(student);
	}
	
	@GET
	@Path("/{studentId}")
	public Student getStudent(@PathParam("studentId") long studentId){
		return studentService.getStudent(studentId);
	}
	
	@PUT
	@Path("/{studentId}")
	public Student updateStudent(@PathParam("studentName") long studentId, Student student){
		student.setId(studentId);
		return studentService.updateStudent(student);
	}
	
	@DELETE
	@Path("/{studentId}")
	public void deleteStudent(@PathParam("studentId") long studentId){
		studentService.removeStudent(studentId);
	}
}
