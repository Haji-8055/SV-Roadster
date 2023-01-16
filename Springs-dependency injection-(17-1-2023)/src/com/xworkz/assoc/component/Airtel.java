package com.xworkz.assoc.component;

import org.springframework.stereotype.Component;

import com.xworkz.assoc.rules.Provider;

@Component
public class Airtel implements Provider {

	public Airtel() {
		System.out.println("created Airtel using no-argument constructor....");
	}

	@Override
	public void connect() {
		System.out.println("implemented connect method in Airtel....");

	}

}
