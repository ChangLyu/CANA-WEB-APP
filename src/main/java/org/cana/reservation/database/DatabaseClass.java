package org.cana.reservation.database;

import java.util.HashMap;
import java.util.Map;

import org.cana.reservation.model.Student;
import org.cana.reservation.model.Teacher;

public class DatabaseClass {
	//maps that map the IDs to messages and profiles
	private static Map<String, Student> students = new HashMap<>();
	private static Map<String, Teacher> teachers = new HashMap<>();
	
	
	//Notice that this setting is not thread safe, we assume that only one person will use this project
	public static Map<String, Student> getStudents(){
		return students;
	}
	
	public static Map<String, Teacher> getTeachers(){
		return teachers;
	}
}
