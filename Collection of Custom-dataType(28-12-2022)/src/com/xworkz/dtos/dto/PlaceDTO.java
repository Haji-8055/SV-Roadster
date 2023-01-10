package com.xworkz.dtos.dto;

import java.io.Serializable;

public class PlaceDTO  implements Serializable{
	
	private String name;
	private boolean isCapital;
	private long population;
	private String famousCrop;

	public PlaceDTO() {
		// TODO Auto-generated constructor stub
	}

	public PlaceDTO(String name, boolean isCapital, long population, String famousFor) {
		this.name = name;
		this.isCapital = isCapital;
		this.population = population;
		this.famousCrop = famousFor;
	}

	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", isCapital=" + isCapital + ", population=" + population + ", famousFor="
				+ famousCrop + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCapital() {
		return isCapital;
	}

	public void setCapital(boolean isCapital) {
		this.isCapital = isCapital;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public String getFamousFor() {
		return famousCrop;
	}

	public void setFamousFor(String famousFor) {
		this.famousCrop = famousFor;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {

			if (obj instanceof PlaceDTO) {
				PlaceDTO casted = (PlaceDTO) obj;
				if (casted.famousCrop.equals(this.famousCrop)) {

					System.out.println("properties are equal");

					return true;
				}
			}
		}

		return false;
	}

}
