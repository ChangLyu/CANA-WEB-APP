package org.cana.reservation.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.cana.reservation.database.DatabaseClass;
import org.cana.reservation.exception.DataNotFoundException;
import org.cana.reservation.model.Student;

public class StudentService {
	private Map<Long, Student> students = DatabaseClass.getStudents();

	public StudentService() {
		//We need to add a email verification function; for major 开启下拉选项，
		students.put(0L, new Student(0, "qihu1992@gmail.com", "lalalalala", "Qi", "Hu", 24, "6132223333", 3, 1, "Electrical and Computer Engineering", "Student", "Hello World!"));
		students.put(1L, new Student(1, "zuiyueelang@gmail.com", "lololololo", "San", "Zhang", 25, "6132343433", 3, 1, "Electrical and Computer Engineering", "Student", "Hello CANA!"));
	}

	public List<Student> getAllStudents() {

		// Since we have the database class, we use the following code
		return new ArrayList<Student>(students.values());
	}

	// With the database, we can operate directly on the database

	public Student getStudent(long id) {
		Student student = students.get(id);
		if (student == null){
			throw new DataNotFoundException("Student with the id " + id + " not found");
		}
		return student;
	}

	public Student addStudent(Student student) {
		student.setId(students.size() + 1);
		students.put(student.getId(), student);
		return student;
	}

	public Student updateStudent(Student student) {
		if (student.getId() <= 0) {
			return null;
		}
		students.put(student.getId(), student);
		return student;
	}

	public Student removeStudent(long id) {
		return students.remove(id);
	}
}
