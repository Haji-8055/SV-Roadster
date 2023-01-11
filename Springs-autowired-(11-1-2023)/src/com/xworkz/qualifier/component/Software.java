package com.xworkz.qualifier.component;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Software {

	@Autowired
	@Qualifier("name1")
	private String name;

	@Autowired
	private double version;

	@Autowired
	private String developer;

	@Autowired
	private LocalDateTime date;

	@Autowired
	private boolean isFree;

	public Software() {
		System.out.println("default constructor of software class");
	}

	@Override
	public String toString() {
		return "Software [name=" + name + ", version=" + version + ", developer=" + developer + ", date=" + date
				+ ", is free=" + isFree + "]";
	}

}
