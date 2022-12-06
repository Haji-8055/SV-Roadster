package com.workz.fixed.constants;

public enum AllDatatypes {

	BIKE1(1000, "kawasaki"), BIKE2(600, "benelli");

	public int cc;
	public String brand;

	AllDatatypes(int cc, String brand) {
		this.cc = cc;
		this.brand = brand;
	}

}
