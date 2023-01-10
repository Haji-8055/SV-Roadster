package com.xworkz.value.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.value.bean.Rocket;

@Configuration
@ComponentScan("com.xworkz.value")
public class Configure {

	@Bean
	public Rocket secondRocket() {

		Rocket rocket = new Rocket();
//		rocket.setName("aryabhata");
//		rocket.setCountry("bharat");
//		rocket.setBudget(450.5);
		return rocket;

	}

}
