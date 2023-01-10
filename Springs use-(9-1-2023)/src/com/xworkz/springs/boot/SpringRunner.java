package com.xworkz.springs.boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springs.configuration.Configure;

public class SpringRunner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(Configure.class);

		String[] s = spring.getBeanDefinitionNames();
		System.out.println(Arrays.toString(s));

		System.out.println("Managing 5 Strings.....");

		String fullName = spring.getBean("getFullName", String.class);
		System.out.println("full name : " + fullName);

		String name = spring.getBean("getName", String.class);
		System.out.println("full name : " + name);

		String fatherName = spring.getBean("getFatherName", String.class);
		System.out.println("full name : " + fatherName);

		String friendName = spring.getBean("getFriendName", String.class);
		System.out.println("full name : " + friendName);

		String job = spring.getBean("getJob", String.class);
		System.out.println("job : " + job);

		System.out.println("Managing 5 booleans.....");

		boolean isJobless = spring.getBean("isJobless", Boolean.class);
		System.out.println("isJobless : " + isJobless);

		boolean isVoter = spring.getBean("isVoter", boolean.class);
		System.out.println("isVoter : " + isVoter);

		boolean isMarried = spring.getBean("isMarried", boolean.class);
		System.out.println("isMarried : " + isMarried);

		boolean isGraduated = spring.getBean("isGraduated", boolean.class);
		System.out.println("isGraduated : " + isGraduated);

		boolean isIndian = spring.getBean("isIndian", boolean.class);
		System.out.println("isIndian : " + isIndian);

		System.out.println("Managing 5 doubles.....");

		double Weight = spring.getBean("getWeight", double.class);
		System.out.println("Weight : " + Weight);

		double Height = spring.getBean("getHeight", double.class);
		System.out.println("Height : " + Height);

		double Income = spring.getBean("getIncome", double.class);
		System.out.println("Income : " + Income);

		double DailySpending = spring.getBean("getDailySpending", double.class);
		System.out.println("DailySpending : " + DailySpending);

		double MobilePrice = spring.getBean("getMobilePrice", double.class);
		System.out.println("MobilePrice : " + MobilePrice);

		
		System.out.println("Managing 1 Arraylist.....");
		ArrayList<String> list = spring.getBean("getList", ArrayList.class);
		System.out.println("ArrayList : " + list);

		
		System.out.println("Managing 1 map.....");
		Map<String, Double> map = spring.getBean("getMap", Map.class);
		System.out.println("Map : " + map);

	}

}
