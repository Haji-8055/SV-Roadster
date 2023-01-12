package com.xworkz.autowired.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	private String name;
	private String type;

	@Autowired
	@Qualifier("number")
	private int number;

	@Autowired
	@Qualifier("eVersion")
	private int version;// p

	private String company;// cons
	private int strokes;// set

	

	@Autowired
	public Engine(@Qualifier("eName") String name, @Qualifier("eType") String type,
			@Qualifier("eCompany") String company) {
		this.name = name;
		this.type = type;
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "Engine [name=" + name + ", type=" + type + ", number=" + number + ", version=" + version + ", company="
				+ company + ", strokes=" + strokes + "]";
	}

	@Autowired
	@Qualifier("eStrokes")
	public void setStrokes(int strokes) {
		this.strokes = strokes;
	}

}
