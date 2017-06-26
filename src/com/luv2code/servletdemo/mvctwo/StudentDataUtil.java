package com.luv2code.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	
	public static List<Student> getStudents() {
		
		// create an empty list
		List<Student> students = new ArrayList<>();
		
		// add sample data
		students.add(new Student("Michael", "Jackson", "mj@email.com"));
		students.add(new Student("Steve", "Jobs", "steviej@email.com"));
		students.add(new Student("Elon", "Musk", "teslaboyz@email.com"));
		
		// return the list
		return students;
		
	}
	
}
