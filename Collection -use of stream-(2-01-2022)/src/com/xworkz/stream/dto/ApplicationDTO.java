package com.xworkz.stream.dto;

import java.io.Serializable;

public class ApplicationDTO implements Serializable {

	private String name;
	private double version;
	private boolean free;
	private String developedBy;
	private int price;

	public ApplicationDTO() {

	}

	public ApplicationDTO(String name, double version, boolean free, String developedBy, int price) {
		super();
		this.name = name;
		this.version = version;
		this.free = free;
		this.developedBy = developedBy;
		this.price = price;
	}

	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", version=" + version + ", free=" + free + ", developedBy="
				+ developedBy + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {

		return 8;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof ApplicationDTO) {

				ApplicationDTO dto = (ApplicationDTO) obj;
				if (dto.getName().equals(this.name) && dto.getVersion() == this.version) {
					return true;
				}
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
