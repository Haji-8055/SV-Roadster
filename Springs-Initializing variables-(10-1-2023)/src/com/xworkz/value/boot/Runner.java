package com.xworkz.value.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.value.bean.Actor;
import com.xworkz.value.bean.Rocket;
import com.xworkz.value.bean.Season;
import com.xworkz.value.configuration.Configure;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(Configure.class);

		System.out.println("initializing properties of rocket using literals....");
		Rocket refOfRocket = spring.getBean("rocket", Rocket.class);
		System.out.println("rocket name : " + refOfRocket.getName());
		System.out.println("rocket country : " + refOfRocket.getCountry());
		System.out.println("rocket budget : " + refOfRocket.getBudget());

		System.out.println("creating another bean of rocket from configure class ");
		Rocket refOfRocket1 = spring.getBean("rd", Rocket.class);
		System.out.println("rocket name : " + refOfRocket1.getName());
		System.out.println("rocket country : " + refOfRocket1.getCountry());
		System.out.println("rocket budget : " + refOfRocket1.getBudget());

		System.out.println("\ninitializing properties of actor using constructor....");
		Actor actor = spring.getBean("actor", Actor.class);
		System.out.println("name : " + actor.getName());
		System.out.println("age : " + actor.getAge());
		System.out.println("language : " + actor.getLanguage());

		System.out.println("creating another bean of Actor from configure class ");
		Actor actor1 = spring.getBean("actor1", Actor.class);
		System.out.println("name : " + actor1.getName());
		System.out.println("age : " + actor1.getAge());
		System.out.println("language : " + actor1.getLanguage());

		System.out.println("\ninitializing properties of season using setter method....");
		Season season = spring.getBean("season", Season.class);
		System.out.println("name : " + season.getName());
		System.out.println("Duration : " + season.getDuration());
		System.out.println("StartingMonth : " + season.getStartingMonth());

		System.out.println("creating another bean of season from configure class ");
		Season season1 = spring.getBean("season1", Season.class);
		System.out.println("name : " + season1.getName());
		System.out.println("Duration : " + season1.getDuration());
		System.out.println("StartingMonth : " + season1.getStartingMonth());
	}

}
