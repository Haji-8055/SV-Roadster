package com.xworkz.string.boot;

import com.xworkz.string.things.Car;

public class CarRunner {

	public static void main(String[] args) {

		//practice program
		Car car = new Car();
		car.display();

		Car car1 = new Car();
		car1.display();

		Car.price = 258;

		car.display();
		car1.display();


	}

}
