package com.xworkz.abstraction.dto;

import java.time.LocalDateTime;

public class PlaceDTO extends AbstractAuditDTO {

	private String name;
	private String city;
	private String use;
	private String builtBy;
	private String state;

	public PlaceDTO() {

	}

	public PlaceDTO(String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate,
			String name, String city, String use, String builtBy, String state) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.name = name;
		this.city = city;
		this.use = use;
		this.builtBy = builtBy;
		this.state = state;
	}

	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", city=" + city + ", use=" + use + ", builtBy=" + builtBy + ", state="
				+ state + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}

	public String getBuiltBy() {
		return builtBy;
	}

	public void setBuiltBy(String builtBy) {
		this.builtBy = builtBy;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
