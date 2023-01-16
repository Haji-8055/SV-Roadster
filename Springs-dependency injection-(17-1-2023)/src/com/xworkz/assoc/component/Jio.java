package com.xworkz.assoc.component;

import org.springframework.stereotype.Component;

import com.xworkz.assoc.rules.Provider;

@Component
public class Jio implements Provider {

	public Jio() {

		System.out.println("created jio using no-argument constructor....");
	}

	@Override
	public void connect() {
		System.out.println("implemented connect method in Jio....");

	}

}
