package com.example.tut8.to_do.factory;

// Create the abstract class called Course
abstract class Course {
	protected int duration; //in semesters
	protected double fee; //in dollars ($)

	// TO-DO: Declare 2 void abstract methods: getDuration(), getFeePerSemester()
	abstract void getDuration();
	abstract  void getFeePerSemester();
	// TO-DO: Declare void method: calculateTotalFee(). Total = duration * fee
public void calculateTotalFee(int duration, double fee) {
	System.out.println("Total = " + duration * fee);
}
}