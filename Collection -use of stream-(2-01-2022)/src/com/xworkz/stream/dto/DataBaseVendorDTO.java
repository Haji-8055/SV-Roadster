package com.xworkz.stream.dto;

import java.io.Serializable;

import com.xworkz.stream.constant.DataBaseType;

public class DataBaseVendorDTO implements Serializable {
	
	private String name;
	private String developedBy;
	private DataBaseType type;
	private double size;
	private double licenseCost;
	
	public DataBaseVendorDTO() {

	}

	public DataBaseVendorDTO(String name, String developedBy, DataBaseType type, double size, double licenseCost) {
		super();
		this.name = name;
		this.developedBy = developedBy;
		this.type = type;
		this.size = size;
		this.licenseCost = licenseCost;
	}
	
	
	@Override
	public String toString() {
		return "DataBaseVendorDTO [name=" + name + ", developedBy=" + developedBy.toUpperCase() + ", type=" + type + ", size=" + size
				+ ", licenseCost=" + licenseCost + "]";
	}

	@Override
	public int hashCode() {

		return 8;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof DataBaseVendorDTO) {

				DataBaseVendorDTO dto = (DataBaseVendorDTO) obj;
				if (dto.getName().equals(this.name) && dto.getDevelopedBy().equals(this.developedBy)) {
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

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public DataBaseType getType() {
		return type;
	}

	public void setType(DataBaseType type) {
		this.type = type;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getLicenseCost() {
		return licenseCost;
	}

	public void setLicenseCost(double licenseCost) {
		this.licenseCost = licenseCost;
	}

	
	

}
