package com.xworkz.value.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket {

//	@Value("india")
	private String country="ind";
//	@Value("indian RH-75")
	private String name="adad";
//	@Value("500.2")
	private Double budget;

	public Rocket() {
		System.out.println("default constructor of Rocket class...");

	}

	public Rocket(String country, String name, Double budget) {
		super();
		this.country = country;
		this.name = name;
		this.budget = budget;
	}

	public String getCountry() {
		return country;
	}

	public String getName() {
		return name;
	}

	public Double getBudget() {
		return budget;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBudget(Double budget) {
		this.budget = budget;
	}

}
