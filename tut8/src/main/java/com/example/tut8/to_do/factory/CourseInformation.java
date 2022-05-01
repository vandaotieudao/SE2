package com.example.tut8.to_do.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Create the CourseInformation class to generate information about the duration 
 * and fee of the course by using the Admission class to get the object of 
 * sub-classes by passing the required information like the course being applied for */
class CourseInformation {
	public static void main(String args[]) throws IOException {
		//TO-DO: Create new Admission object
	 Admission admission = new Admission();
		//TO-DO: Get user's input for the course's name
		System.out.println("Enter the name course");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		//TO-DO: Create new course with created Admission
		admission.admittingCourse(name);
		//TO-DO: Display the require duration in semesters, required fee per semester and for whole course
Course course = admission.admittingCourse(name);
course.getDuration();
course.getFeePerSemester();
	}
}  