package com.xworkz.qualifier.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineer {

	@Autowired
	@Qualifier("erName")
	private String name;
	
	@Autowired
	private int salary;
	
	@Autowired
	private String companyName;
	
	@Autowired
	private double experience;

	public SoftwareEngineer() {

		System.out.println("default constructor of SoftwareEngineer..... ");

	}

	@Override
	public String toString() {
		return "SoftwareEngineer [name=" + name + ", salary=" + salary + ", companyName=" + companyName
				+ ", experience=" + experience + "]";
	}
	

}
