package com.xworkz.association.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Director {
	@Autowired
	private Experience experience;
	@Autowired
	private Skill skill;

	public Director() {
		System.out.println("created Director using no-arg constructor.");
	}

	public void display() {
		System.out.println(experience);
		System.out.println(skill);

	}
	
	public Experience getExperience() {
		return experience;
	}
	
	public Skill getSkill() {
		return skill;
	}
}
