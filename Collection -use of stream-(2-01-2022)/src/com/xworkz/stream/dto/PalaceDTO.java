package com.xworkz.stream.dto;

public class PalaceDTO {

	private String name;
	private String location;
	private String builtBy;
	private boolean destroyed;
	private Double visitingFees;

	public PalaceDTO() {

	}

	public PalaceDTO(String name, String location, String builtBy, boolean destroyed, Double visitingFees) {
		super();
		this.name = name;
		this.location = location;
		this.builtBy = builtBy;
		this.destroyed = destroyed;
		this.visitingFees = visitingFees;
	}

	@Override
	public int hashCode() {
		return 30;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof PalaceDTO) {
				PalaceDTO dto = (PalaceDTO) obj;
				if (dto.getName().equalsIgnoreCase(this.name) && dto.getLocation().equalsIgnoreCase(this.location)) {
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBuiltBy() {
		return builtBy;
	}

	public void setBuiltBy(String builtBy) {
		this.builtBy = builtBy;
	}

	public boolean isDestroyed() {
		return destroyed;
	}

	public void setDestroyed(boolean destroyed) {
		this.destroyed = destroyed;
	}

	public Double getVisitingFees() {
		return visitingFees;
	}

	public void setVisitingFees(Double visitingFees) {
		this.visitingFees = visitingFees;
	}

}
