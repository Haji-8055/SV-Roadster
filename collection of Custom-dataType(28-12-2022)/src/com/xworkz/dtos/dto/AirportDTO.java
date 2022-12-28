package com.xworkz.dtos.dto;

import java.io.Serializable;

public class AirportDTO implements Serializable {

	private String name;
	private String location;
	private int noOfStaff;

	public AirportDTO() {
		// TODO Auto-generated constructor stub
	}

	public AirportDTO(String name, String location, int noOfPassengers) {
		this.name = name;
		this.location = location;
		this.noOfStaff = noOfPassengers;
	}

	@Override
	public String toString() {
		return "AirportDTO [name=" + name + ", location=" + location + ", noOfPassengers=" + noOfStaff + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfPassengers() {
		return noOfStaff;
	}

	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfStaff = noOfPassengers;
	}

	@Override
	public boolean equals(Object air) {
		if (air != null) {
			if (air instanceof AirportDTO) {
				AirportDTO casted = (AirportDTO) air;
				if (this.name.equals(casted.name)) {
					System.out.println("property is equal");
					return true;
				}
			}
		}
		return false;
	}

}
