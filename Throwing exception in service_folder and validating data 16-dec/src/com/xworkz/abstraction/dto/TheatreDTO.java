package com.xworkz.abstraction.dto;

import java.time.LocalDateTime;

public class TheatreDTO extends AbstractAuditDTO {

	private String id;
	private String name;
	private String brand;
	private int seats;

	public TheatreDTO() {

	}

	public TheatreDTO(String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate,
			String id, String name, String brand, int seats) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "TheatreDTO [id=" + id + ", name=" + name + ", brand=" + brand + ", seats=" + seats + ", toString()="
				+ super.toString() + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

}
