package com.xworkz.isahasa.follower;

public abstract class Person {

	private String name;
	private String surname;
	private int age;
	private long mobileNo;
	private String city;

	public Person(String name, int age, long mobileNo, String surname, String city) {

		super();
		System.out.println("Person class constructor in order to do chaining and initialize instance variables");

		this.name = name;
		this.age = age;
		this.mobileNo = mobileNo;
		this.surname = surname;
		this.city = city;

		System.out.println("person name : " + this.name);
		System.out.println("person age : " + this.age);
		System.out.println("person mobileNo : " + this.mobileNo);
		System.out.println("person surname : " + this.surname);
		System.out.println("person city : " + this.city);
	}

	abstract void eat();

	abstract void sleep();

}
