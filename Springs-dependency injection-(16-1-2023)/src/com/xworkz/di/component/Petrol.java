package com.xworkz.di.component;

import org.springframework.stereotype.Component;

@Component
public class Petrol implements Fuel {

	@Override
	public void consume() {

		System.out.println("running consume method...... ");
	}

}
