package com.xworkz.duplicates.dto;

import java.io.Serializable;

public class MovieDTO implements Serializable {

	private String name;
	private String language;
	private int budget;

	public MovieDTO() {

	}

	public MovieDTO(String name, String language, int budget) {
		super();
		this.name = name;
		this.language = language;
		this.budget = budget;
	}

	@Override
	public String toString() {
		return "MovieDTO [name=" + name + ", language=" + language + ", budget=" + budget + "]";
	}

	@Override
	public int hashCode() {
		return 8;
	}
	

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			if (obj instanceof MovieDTO) {
				MovieDTO dto = (MovieDTO) obj;
				if (dto.getName().equals(this.name) && dto.getLanguage().equals(this.language)) {
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

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

}
