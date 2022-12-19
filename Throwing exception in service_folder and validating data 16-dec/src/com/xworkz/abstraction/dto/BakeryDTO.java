package com.xworkz.abstraction.dto;

import java.time.LocalDateTime;

public class BakeryDTO extends AbstractAuditDTO{

	private String name;
	private String owner;
	private String location;
	private String famousFor;
	private long contact;

	public BakeryDTO() {

	}

	public BakeryDTO(String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate,
			String name, String owner, String location, String famousFor, long contact) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.name = name;
		this.owner = owner;
		this.location = location;
		this.famousFor = famousFor;
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "BakeryDTO [name=" + name + ", owner=" + owner + ", location=" + location + ", famousFor=" + famousFor
				+ ", contact=" + contact + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}
	
}
