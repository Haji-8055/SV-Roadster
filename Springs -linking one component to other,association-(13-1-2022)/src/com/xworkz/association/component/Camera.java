package com.xworkz.association.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camera {
	
	@Autowired
	private Lens lens;
	
	@Autowired
	private Battery battery;
	 
	public Camera() {
		System.out.println("created Camera using no-arg constructor.");
		
	}
	
	public void display() {
		System.out.println(lens);
		System.out.println(battery);		
	}
	
	
	public Battery getBattery() {
		return battery;
	}
	
	public Lens getLens() {
		return lens;
	}

}
