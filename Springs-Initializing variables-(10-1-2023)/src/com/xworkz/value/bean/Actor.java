package com.xworkz.value.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {

	private String name;
	private String language;
	private Double age;
	
//	public Actor() {
//		System.out.println("default constructor of Actor class...");
//	}
	
	public Actor(@Value("salman khan") String name,@Value("hindi") String language,@Value("50.0") Double age) {
		super();
		this.name = name;
		this.language = language;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getLanguage() {
		return language;
	}

	public Double getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void setAge(Double age) {
		this.age = age;
	}
	
	
}
