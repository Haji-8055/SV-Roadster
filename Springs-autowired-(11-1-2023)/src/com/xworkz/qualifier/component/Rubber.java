package com.xworkz.qualifier.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rubber {

	@Autowired
	@Qualifier("rubberName")
	private String name;

	@Autowired
	@Qualifier("rubberType")
	private String type;

	@Autowired
	@Qualifier("rubberColor")
	private String color;

	@Autowired
	@Qualifier("rubberShape")
	private String shape;

	@Autowired
	@Qualifier("rubberSize")
	private String size;

	@Autowired
	@Qualifier("rubberPrice")
	private int price;

	@Autowired
	@Qualifier("isRubberStolen")
	private boolean isStolen;

	public Rubber() {
		System.out.println("default constructor of rubber...");
	}

	@Override
	public String toString() {
		return "Rubber [name=" + name + ", type=" + type + ", color=" + color + ", shape=" + shape + ", size=" + size
				+ ", price=" + price + ", isStolen=" + isStolen + "]";
	}

}
