package com.xworkz.qualifier.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Bike {

	@Autowired
	@Qualifier("bikeName")
	private String name;

	@Autowired
	private byte wheels;

	@Autowired
	private short cc;

	@Autowired
	@Qualifier("maxSpeed")
	private int maxSpeed;

	@Autowired
	@Qualifier("odo")
	private long odo;

	@Autowired
	@Qualifier("height")
	private float height;

	@Autowired
	@Qualifier("weight")
	private double weight;

	@Autowired
	@Qualifier("comfortClass")
	private char comfortClass;

	@Autowired
	@Qualifier("isFast")
	private boolean isFast;

	public Bike() {
		System.out.println("default constructor of bike");
	}

	@Override
	public String toString() {
		return "Bike [name=" + name + ", wheels=" + wheels + ", cc=" + cc + ", maxSpeed=" + maxSpeed + ", odo=" + odo
				+ ", height=" + height + ", weight=" + weight + ", comfortClass=" + comfortClass + ", isFast=" + isFast
				+ "]";
	}

}
