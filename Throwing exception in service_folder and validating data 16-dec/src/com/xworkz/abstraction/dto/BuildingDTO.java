package com.xworkz.abstraction.dto;

import java.time.LocalDateTime;

public class BuildingDTO extends AbstractAuditDTO {

	private int no;
	private String name;
	private int floors;
	private boolean isLiftAvailable;
	private boolean isParkingAvailable;
	private String type;

	public BuildingDTO() {

	}

	public BuildingDTO(String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate, int no,
			String name, int floors, boolean isLiftAvailable, boolean isParkingAvailable, String type) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.no = no;
		this.name = name;
		this.floors = floors;
		this.isLiftAvailable = isLiftAvailable;
		this.isParkingAvailable = isParkingAvailable;
		this.type = type;
	}

	@Override
	public String toString() {
		return "BuildingDTO [no=" + no + ", name=" + name + ", floors=" + floors + ", isLiftAvailable="
				+ isLiftAvailable + ", isParkingAvailable=" + isParkingAvailable + ", type=" + type + ", toString()="
				+ super.toString() + "]";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public boolean isLiftAvailable() {
		return isLiftAvailable;
	}

	public void setLiftAvailable(boolean isLiftAvailable) {
		this.isLiftAvailable = isLiftAvailable;
	}

	public boolean isParkingAvailable() {
		return isParkingAvailable;
	}

	public void setParkingAvailable(boolean isParkingAvailable) {
		this.isParkingAvailable = isParkingAvailable;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
