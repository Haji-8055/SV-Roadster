package com.xworkz.autowired.component;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Snake {

	private String name;//cons
	@Autowired
	@Qualifier("sLength")
	private double length;//p
	@Autowired
	@Qualifier("color")
	private String color;//p
	private String type;//c
	private boolean poisonous;//c


	public Snake(String name, @Qualifier("sType")String type, boolean poisonous) {
		this.name = name;
		this.type = type;
		this.poisonous = poisonous;
	}

	@Override
	public String toString() {
		return "Snake [name=" + name + ", length=" + length + ", color=" + color + ", type=" + type + ", poisonous="
				+ poisonous + "]";
	}






}
