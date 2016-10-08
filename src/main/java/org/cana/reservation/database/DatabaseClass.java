package org.cana.reservation.database;

import java.util.Hashtable;

import org.cana.reservation.model.Course;
import org.cana.reservation.model.Student;
import org.cana.reservation.model.Teacher;

public class DatabaseClass {
	//maps that map the IDs to messages and profiles
	private static Hashtable<Long, Student> students = new Hashtable<>();
	private static Hashtable<Long, Teacher> teachers = new Hashtable<>();
	private static Hashtable<Long, Course> courses = new Hashtable<>();
	
	
	//Notice that this setting is not thread safe, we assume that only one person will use this project
	public static Hashtable<Long, Student> getStudents(){
		return students;
	}
	
	public static Hashtable<Long, Teacher> getTeachers(){
		return teachers;
	}
	
	public static Hashtable<Long, Course> getCourses(){
		return courses;
	}
}
