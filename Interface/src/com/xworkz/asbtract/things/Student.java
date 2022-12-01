package com.xworkz.asbtract.things;

public class Student implements College {

	@Override
	public int fees() {
		System.out.println("implemented fees method in student class which is a abstract method from interface ");

		return 0;
	}

	@Override
	public boolean isGood() {
		System.out.println("implemented isGood method in student class which is a abstract method from interface ");
		return false;
	}

	@Override
	public boolean isReputed() {
		return false;
	}

	@Override
	public int teachers() {
		return 0;
	}

	@Override
	public int uniform() {
		return 0;
	}

	public void tester() {
		System.out.println("tester method from student class");
	}

}
