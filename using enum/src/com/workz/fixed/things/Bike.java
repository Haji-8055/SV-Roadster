package com.workz.fixed.things;

import com.workz.fixed.constants.AllDatatypes;

public class Bike {

	public String name;
	public AllDatatypes bike;

	public Bike(String name, AllDatatypes bike) {
		super();
		this.name = name;
		this.bike = bike;
	}

	public void display() {
		System.out.println("bike name is " + this.name);
		System.out.println("CC of bike : " + bike.cc);
		System.out.println("brand of bike : " + bike.brand);
	}

}
