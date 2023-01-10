package com.xworkz.value.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.value.bean.Rocket;
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
		Rocket refOfRocket1 = spring.getBean("secondRocket", Rocket.class);
		System.out.println("rocket name : " + refOfRocket1.getName());
		System.out.println("rocket country : " + refOfRocket1.getCountry());
		System.out.println("rocket budget : " + refOfRocket1.getBudget());
	}

}
