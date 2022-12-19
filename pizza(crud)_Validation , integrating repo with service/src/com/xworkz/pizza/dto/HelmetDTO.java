package com.xworkz.pizza.dto;

import java.time.LocalDateTime;

import com.xworkz.pizza.constant.Color;
import com.xworkz.pizza.constant.HelmetType;

public class HelmetDTO extends AbstractAuditDTO {

	private String brand;
	private HelmetType type;
	private Color color;
	private double price;

	public HelmetDTO() {

	}

	public HelmetDTO(String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate,
			String brand, HelmetType type, Color color, double price) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.brand = brand;
		this.type = type;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "HelmetDTO [brand=" + brand + ", type=" + type + ", color=" + color + ", price=" + price
				+ ", toString()=" + super.toString() + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public HelmetType getType() {
		return type;
	}

	public void setType(HelmetType type) {
		this.type = type;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
