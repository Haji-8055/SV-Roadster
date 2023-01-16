package com.xworkz.association.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Battery {
	
	@Autowired    
	private Capacity capacity;
	
	public Battery() {
		System.out.println("created battery using no-arg constructor.");

	}
	
	public void dis() {
		System.out.println(capacity);
	}
	
	public Capacity getCapacity() {
		return capacity;
	}

}
