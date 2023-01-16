package com.xworkz.entries.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class ChocolateInfo {

	public static void main(String[] args) {

		Map<String, Double> map = new HashMap<String, Double>();
		map.put("dairy Milk Bubbly", 45.0);
		map.put("kitKat", 10.0);
		map.put("Amul almond", 39.0);
		map.put("munch", 46.0);
		map.put("perk", 34.0);
		map.put("eclairs", 36.0);
		map.put("kit kat special", 38.0);
		map.put("ferrero rocher", 415.0);
		map.put("temptation", 96.0);
		map.put("rum raisin", 105.0);

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
