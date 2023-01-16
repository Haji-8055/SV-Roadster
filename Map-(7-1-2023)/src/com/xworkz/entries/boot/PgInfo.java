package com.xworkz.entries.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PgInfo {

	public static void main(String[] args) {

		Map<String, Double> map = new HashMap<String, Double>();
		map.put("Akshay pg", 4500.0);
		map.put("Shubam", 4800.0);
		map.put("sri nivas", 3900.0);
		map.put("ankit pg", 4600.0);
		map.put("khushi pg", 3400.0);
		map.put("avinash pg", 3600.0);
		map.put("anna pg", 3800.0);
		map.put("first pg", 4150.0);
		map.put("aniket pg", 4300.0);
		map.put("venkat pg", 4500.0);

		System.out.println("size : " + map.size());
		System.out.println("isEmpty : " + map.isEmpty());

		Set<String> keys = map.keySet();
		System.out.println("===========printing keys===========");
		for (String key : keys) {
			System.out.println(key);
		}

		Collection<Double> values = map.values();
		System.out.println("===========printing values===========");
		for (Double value : values) {
			System.out.println(value);
		}

		System.out.println("===========printing entries===========");
		Set<Entry<String, Double>> set = map.entrySet();
		for (Entry<String, Double> entry : set) {
			System.out.println(entry);

		}

	}

}
