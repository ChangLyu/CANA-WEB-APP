package org.cana.reservation.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.cana.reservation.database.DatabaseClass;
import org.cana.reservation.exception.DataNotFoundException;
import org.cana.reservation.model.Teacher;

public class TeacherService {
	private Map<Long, Teacher> teachers = DatabaseClass.getTeachers();

	public TeacherService() {
		//We need to add a email verification function; for major 开启下拉选项，
		teachers.put(0L, new Teacher(0, "nanli@gmail.com", "lalalalala", "Nan", "Li", 30, "6132223333", "Accounting", "Teacher", "Hello World!"));
		teachers.put(1L, new Teacher(1, "IrisXia@gmail.com", "lololololo", "Iris", "Xia", 28, "6132343433", "Electrical and Computer Engineering", "Teacher", "Hello CANA!"));
	}

	public List<Teacher> getAllTeachers() {

		// Since we have the database class, we use the following code
		return new ArrayList<Teacher>(teachers.values());
	}

	// With the database, we can operate directly on the database

	public Teacher getTeacher(long id) {
		Teacher teacher = teachers.get(id);
		if (teacher == null){
			throw new DataNotFoundException("Teacher with the id " + id + " not found");
		}
		return teacher;
	}

	public Teacher addTeacher(Teacher teacher) {
		teacher.setId(teachers.size() + 1);
		teachers.put(teacher.getId(), teacher);
		return teacher;
	}

	public Teacher updateTeacher(Teacher teacher) {
		if (teacher.getId() <= 0) {
			return null;
		}
		teachers.put(teacher.getId(), teacher);
		return teacher;
	}

	public Teacher removeTeacher(long id) {
		return teachers.remove(id);
	}
}
