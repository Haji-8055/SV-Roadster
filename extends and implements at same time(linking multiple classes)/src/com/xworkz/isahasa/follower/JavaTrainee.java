package com.xworkz.isahasa.follower;

import com.xworkz.isahasa.rules.XworkzRule;

public class JavaTrainee extends Person implements XworkzRule {

	public JavaTrainee(String name, int age, long mobileNo, String surname, String city) {
		super(name, age, mobileNo, surname, city);
		
		System.out.println("");

	}

	@Override
	public boolean uploadTask() {

		return true;
	}

	@Override
	public boolean completedProgram() {

		return true;
	}

	@Override
	void eat() {

	}

	@Override
	void sleep() {

	}

	void training() {

	}

	void executeProgram() {

	}

}
