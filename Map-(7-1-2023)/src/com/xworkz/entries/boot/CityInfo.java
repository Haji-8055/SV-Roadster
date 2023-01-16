package com.xworkz.entries.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class CityInfo {

	public static void main(String[] args) {

		Map<String, Double> map = new HashMap<String, Double>();
		map.put("bagalkot", 36.0);
		map.put("bengaluru", 28.0);
		map.put("tumkur", 32.0);
		map.put("hubli", 29.0);
		map.put("bijapur", 34.0);
		map.put("gulbarga", 36.0);
		map.put("ajmer", 38.0);
		map.put("delhi", 38.0);
		map.put("mudhol", 34.0);
		map.put("raichur", 46.0);

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
