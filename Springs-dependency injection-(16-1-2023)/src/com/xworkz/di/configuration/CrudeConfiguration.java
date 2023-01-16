package com.xworkz.di.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.di")
public class CrudeConfiguration {

	public CrudeConfiguration() {
		System.out.println("created CrudeConfiguration using no-argument constructor... ");
	}

}
