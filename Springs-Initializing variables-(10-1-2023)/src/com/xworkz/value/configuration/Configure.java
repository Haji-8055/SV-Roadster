package com.xworkz.value.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.value.bean.Actor;
import com.xworkz.value.bean.Rocket;
import com.xworkz.value.bean.Season;

@Configuration
@ComponentScan("com.xworkz.value")
public class Configure {

	@Bean("rd")
	public Rocket secondRocket() {

		Rocket rocket = new Rocket("india", "aryabhata", 450.0);
//		rocket.setName("aryabhata");
//		rocket.setCountry("bharat");
//		rocket.setBudget(450.5);
		return rocket;

	}

	@Bean
	public Actor actor1() {

		Actor actor = new Actor("s r k", "hindi", 49.0);
		return actor;
	}

	@Bean
	public Season season1() {

		Season season = new Season();
		season.setName("summer");
		season.setDuration("feb march apr");
		season.setStartingMonth("feb");
		return season;

	}

}
