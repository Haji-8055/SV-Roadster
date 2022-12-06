package com.workz.fixed.boot;

import com.workz.fixed.constants.AllDatatypes;
import com.workz.fixed.things.Bike;

public class BikeRunner {

	public static void main(String[] args) {

		Bike bike11 = new Bike("ZX10r", AllDatatypes.BIKE1);
		bike11.display();

	}
}
