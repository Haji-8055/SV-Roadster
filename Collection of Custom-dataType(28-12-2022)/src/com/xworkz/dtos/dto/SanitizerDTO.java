package com.xworkz.dtos.dto;

public class SanitizerDTO {

	private String brandAmbassador;
	private String brand;
	private String colour;
	private int price;

	public SanitizerDTO() {

	}

	public SanitizerDTO(String brandAmbassador, String brand, String colour, int price) {
		super();
		this.brandAmbassador = brandAmbassador;
		this.brand = brand;
		this.colour = colour;
		this.price = price;
	}

	@Override
	public String toString() {
		return "SanitizerDTO [brandAmbassador=" + brandAmbassador + ", brand=" + brand + ", colour=" + colour
				+ ", price=" + price + "]";
	}

	public String getAmbassador() {
		return brandAmbassador;
	}

	public void setAmbassador(String brandAmbassador) {
		this.brandAmbassador = brandAmbassador;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
