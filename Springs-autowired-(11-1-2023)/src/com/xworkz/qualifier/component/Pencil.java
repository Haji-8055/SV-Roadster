package com.xworkz.qualifier.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil {

	@Autowired
	@Qualifier("pencilName")
	private String name;

	@Autowired
	@Qualifier("pencilType")
	private String type;

	@Autowired
	@Qualifier("pencilColor")
	private String color;

	@Autowired
	@Qualifier("pencilPrice")
	private int price;

	@Autowired
	private boolean isSharp;

	@Autowired
	private boolean isStolen;
	
	public Pencil() {

		System.out.println("default constructor of pencil class...");
	}

	@Override
	public String toString() {
		return "Pencil [name=" + name + ", type=" + type + ", color=" + color + ", price=" + price + ", isSharp="
				+ isSharp + ", isStolen=" + isStolen + "]";
	}

}
