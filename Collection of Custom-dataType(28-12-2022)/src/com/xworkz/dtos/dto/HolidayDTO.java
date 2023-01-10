package com.xworkz.dtos.dto;

import java.io.Serializable;

public class HolidayDTO implements Serializable{
	private String type;
	private String festivalName;
	private int month;

	public HolidayDTO() {
		// TODO Auto-generated constructor stub
	}

	public HolidayDTO(String type, String festivalName, int month) {
		this.type = type;
		this.festivalName = festivalName;
		this.month = month;
	}

	@Override
	public String toString() {
		return "HolidayDTO [type=" + type + ", festivalName=" + festivalName + ", month=" + month + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFestivalName() {
		return festivalName;
	}

	public void setFestivalName(String festivalName) {
		this.festivalName = festivalName;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	@Override
	public boolean equals(Object festival) {
		if (festival != null) {
			if (festival instanceof HolidayDTO) {
				HolidayDTO casted = (HolidayDTO) festival;
				if (this.type.equals(casted.type)) {
					System.out.println("property is equal");
					return true;
				}
			}
		}
		return false;
	}

}
