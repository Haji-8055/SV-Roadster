package com.xworkz.assoc.component;

import org.springframework.stereotype.Component;

import com.xworkz.assoc.rules.Browser;

@Component
public class Chrome implements Browser {
	
	public Chrome() {
		System.out.println("created Chrome using no-argument constructor....");
	}

	@Override
	public void browse() {
		System.out.println("implemented browse method in chrome....");
	}

}
