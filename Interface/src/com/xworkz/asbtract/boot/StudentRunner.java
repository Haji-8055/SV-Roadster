package com.xworkz.asbtract.boot;

import com.xworkz.asbtract.things.*;

public class StudentRunner {

	public static void main(String[] args) {

		Student student = new Student();// if we create instance using same class it can access all the methods from class
										// and interface
		student.fees();
		student.isGood();
		student.tester();  //class method

		College student1 = new Student();// if we create instance using interface it can access only the methods from
											// interface
		System.out.println(System.lineSeparator());
		student1.fees();
		student1.isGood();
		//student1.tester();

	}

}
