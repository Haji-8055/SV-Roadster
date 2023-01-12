package com.xworkz.autowired.component;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Ghost {

	//10string,//10property
	private String name;
	private String gender;
	private String dressColor;
	private double nailLength;
	private String type;
	private boolean flying;
	private LocalDate dateOfDeath;
	private String location;
	private int nOfGhosts;
	private int age;
	@Autowired
	private boolean grandGhostPresent;
	@Autowired
	private String gName;
	@Autowired
	private String gType;
	@Autowired
	private String language;
	@Autowired
	private boolean walking;
	@Autowired
	private LocalDate gdateOfDeath;
	@Autowired
	private String deathLocation;
	@Autowired
	private double hairLength;
	@Autowired
	private String gGender;
	@Autowired
	private boolean ghostVisible;

	public Ghost(@Qualifier("ghostName") String name,@Qualifier("ghostGender") String gender,  String dressColor, double nailLength, @Qualifier("ghostType") String type, boolean flying,
			LocalDate dateOfDeath, String location, int nOfGhosts, int age) {
		this.name = name;
		this.gender = gender;
		this.dressColor = dressColor;
		this.nailLength = nailLength;
		this.type = type;
		this.flying = flying;
		this.dateOfDeath = dateOfDeath;
		this.location = location;
		this.nOfGhosts = nOfGhosts;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Ghost [name=" + name + ", gender=" + gender + ", dressColor=" + dressColor + ", nailLength="
				+ nailLength + ", type=" + type + ", flying=" + flying + ", dateOfDeath=" + dateOfDeath + ", location="
				+ location + ", nOfGhosts=" + nOfGhosts + ", age=" + age + ", grandGhostPresent=" + grandGhostPresent
				+ ", gName=" + gName + ", gType=" + gType + ", language=" + language + ", walking=" + walking
				+ ", gdateOfDeath=" + gdateOfDeath + ", deathLocation=" + deathLocation + ", hairLength=" + hairLength
				+ ", gGender=" + gGender + ", ghostVisible=" + ghostVisible + "]";
	}







}