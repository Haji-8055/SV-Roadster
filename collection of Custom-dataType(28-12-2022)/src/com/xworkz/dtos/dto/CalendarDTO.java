package com.xworkz.dtos.dto;

import java.io.Serializable;

public class CalendarDTO implements Serializable {
	private String type;
	private int noOfmonths;
	private int year;

	public CalendarDTO() {
		// TODO Auto-generated constructor stub
	}

	public CalendarDTO(String type, int noOfmonths, int year) {
		this.type = type;
		this.noOfmonths = noOfmonths;
		this.year = year;
	}

	@Override
	public String toString() {
		return "CalendarDTO [type=" + type + ", noOfmonths=" + noOfmonths + ", year=" + year + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoOfmonths() {
		return noOfmonths;
	}

	public void setNoOfmonths(int noOfmonths) {
		this.noOfmonths = noOfmonths;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public boolean equals(Object date) {
		if (date != null) {
			if (date instanceof CalendarDTO) {
				CalendarDTO casted = (CalendarDTO) date;
				if (this.type.equals(casted.type)) {
					System.out.println("property is equal");
					return true;
				}
			}
		}
		return false;
	}
}
