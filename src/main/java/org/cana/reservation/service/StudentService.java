package org.cana.reservation.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.cana.reservation.database.DatabaseClass;
import org.cana.reservation.exception.DataNotFoundException;
import org.cana.reservation.model.Student;

public class StudentService {
	private Map<String, Student> students = DatabaseClass.getStudents();

	public StudentService() {
		//We need to add a email verification function; for major 开启下拉选项，
		students.put("qihu1992@gmail.com", new Student("qihu1992@gmail.com", "lalalalala", "Qi", "Hu", 24, "6132223333", 3, 1, "Electrical and Computer Engineering", "Student", "Hello World!"));
		students.put("zuiyueelang@gmail.com", new Student("zuiyueelang@gmail.com", "lololololo", "San", "Zhang", 25, "6132343433", 3, 1, "Electrical and Computer Engineering", "Student", "Hello CANA!"));
	}

	public List<Student> getAllStudents() {
		// If we don't have database class, we use the following code
		/*
		 * Student m1 = new Student(1L, "Hello World!", "Adrian"); Student m2 =
		 * new Student(2L, "Hello Jersey!", "Adrian"); List<Student> list = new
		 * ArrayList<>(); list.add(m1); list.add(m2); return list;
		 */

		// If we have database class, we use the following code
		return new ArrayList<Student>(students.values());
	}

	// With the database, we can operate directly on the database

	public Student getStudent(String emailAddress) {
		Student student = students.get(emailAddress);
		if (student == null){
			throw new DataNotFoundException("Student with the email address " + emailAddress + " not found");
		}
		return student;
	}

	public List<Student> getAllStudentsForYear(int year) {
		List<Student> studentsForYear = new ArrayList<>();
		Calendar cal = Calendar.getInstance();
		for(Student student : students.values()){
			cal.setTime(student.getCreated());
			if(cal.get(Calendar.YEAR) == year){
				studentsForYear.add(student);
			}
		}
		return studentsForYear;
	}

	public List<Student> getAllStudentsPaginated(int start, int size) {
		ArrayList<Student> list = new ArrayList<Student>(students.values());
		if(start+size > list.size()) return new ArrayList<Student>();
		return list.subList(start, start+size);

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
