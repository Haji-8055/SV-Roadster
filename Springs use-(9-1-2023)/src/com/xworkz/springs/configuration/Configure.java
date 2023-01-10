package com.xworkz.springs.configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springs")
public class Configure {

	@Bean
	public String getName() {
		return "Haji";
	}

	@Bean
	public String getFullName() {
		return "SayedMurtuza";
	}

	@Bean
	public String getFatherName() {
		return "Ameer";
	}

	@Bean
	public String getFriendName() {
		return "Furqan";
	}

	@Bean
	public String getJob() {
		return "Software";
	}

	// boolean...................

	@Bean
	public boolean isJobless() {

		return true;
	}

	@Bean
	public boolean isVoter() {

		return true;
	}

	@Bean
	public boolean isMarried() {

		return false;
	}

	@Bean
	public boolean isGraduated() {

		return true;
	}

	@Bean
	public boolean isIndian() {

		return true;
	}

	// doubles...................

	@Bean
	public double getWeight() {

		return 65.7;
	}

	@Bean
	public double getHeight() {

		return 5.9;
	}

	@Bean
	public double getIncome() {

		return 3200;
	}

	@Bean
	public double getDailySpending() {

		return 110;
	}

	@Bean
	public double getMobilePrice() {

		return 73000;
	}

//	arraylist.....
	@Bean
	public ArrayList<String> getList() {

		ArrayList<String> list = new ArrayList<String>();
		list.add("kawasaki");
		list.add("ducati");
		list.add("BMW");
		return list;
	}

	@Bean
	public Map<String, Double> getMap() {

		Map<String, Double> map = new HashMap();
		map.put("haji", 65.6);
		map.put("Furqan", 63.2);

//		Set<String> setOfKeys = map.keySet();
//		Set<Entry<String, Double>> setOfEntries = map.entrySet();
		
		return map;
	}

}
