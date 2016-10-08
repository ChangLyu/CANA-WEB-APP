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

import org.cana.reservation.model.Teacher;
import org.cana.reservation.service.TeacherService;

@Path("/teachers")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TeacherResource {

	private TeacherService teacherService = new TeacherService();
	
	@GET
	public List<Teacher> getTeachers(){
		return teacherService.getAllTeachers();
	}
	
	@POST
	public Teacher addTeacher(Teacher teacher){
		return teacherService.addTeacher(teacher);
	}
	
	@GET
	@Path("/{teacherId}")
	public Teacher getTeacher(@PathParam("teacherId") long teacherId){
		return teacherService.getTeacher(teacherId);
	}
	
	@PUT
	@Path("/{teacherId}")
	public Teacher updateTeacher(@PathParam("teacherName") long teacherId, Teacher teacher){
		teacher.setId(teacherId);
		return teacherService.updateTeacher(teacher);
	}
	
	@DELETE
	@Path("/{teacherId}")
	public void deleteTeacher(@PathParam("teacherId") long teacherId){
		teacherService.removeTeacher(teacherId);
	}
}
