package com.xworkz.abstraction.dto;

import java.time.LocalDateTime;

public class RailwayStationDTO extends AbstractAuditDTO {

	private String name;
	private int noOfPlatforms;
	private double area;
	private double platformTicketPrice;

	public RailwayStationDTO() {

	}

	public RailwayStationDTO(String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate,
			String name, int noOfPlatforms, double area, double platformTicketPrice) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.name = name;
		this.noOfPlatforms = noOfPlatforms;
		this.area = area;
		this.platformTicketPrice = platformTicketPrice;
	}

	@Override
	public String toString() {
		return "RailwayStation [name=" + name + ", noOfPlatforms=" + noOfPlatforms + ", area=" + area
				+ ", platformTicketPrice=" + platformTicketPrice + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfPlatforms() {
		return noOfPlatforms;
	}

	public void setNoOfPlatforms(int noOfPlatforms) {
		this.noOfPlatforms = noOfPlatforms;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPlatformTicketPrice() {
		return platformTicketPrice;
	}

	public void setPlatformTicketPrice(double platformTicketPrice) {
		this.platformTicketPrice = platformTicketPrice;
	}

}
