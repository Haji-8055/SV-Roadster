package com.xworkz.value.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {

	private String name;
	private String duration;
	private String startingMonth;

	public Season() {

		System.out.println("default constructor of Season class...");

	}

	public Season(String name, String duration, String startingMonth) {
		super();
		this.name = name;
		this.duration = duration;
		this.startingMonth = startingMonth;
	}

	public String getName() {
		return name;
	}

	public String getDuration() {
		return duration;
	}

	public String getStartingMonth() {
		return startingMonth;
	}

	@Value("winter")
	public void setName(String name) {
		this.name = name;
	}

	@Value("dec jan feb")
	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Value("december")
	public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}

}
