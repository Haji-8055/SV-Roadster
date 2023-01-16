package com.xworkz.assoc.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.assoc.rules.Browser;
import com.xworkz.assoc.rules.Provider;

@Component
public class FireFox implements Browser {
	
	@Autowired
	@Qualifier("jio")
	private Provider jio;
	
	
	@Autowired
	@Qualifier("airtel")
	private Provider airtel;
	
	public FireFox() {
		System.out.println("created FireFox using no-argument constructor....");
	}

	@Override
	public void browse() {
		System.out.println("implemented browse method in FireFox....");
		System.out.println("invoking methods of provider through browse method........");
		jio.connect();
		airtel.connect();

	}

}
