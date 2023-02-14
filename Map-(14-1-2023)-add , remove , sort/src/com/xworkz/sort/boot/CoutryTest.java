package com.xworkz.sort.boot;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class CoutryTest {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("india", 5648);
		map.put("sri lanka", 522);
		map.put("USA", 3524);
		map.put("bangladesh", 5555);
		map.put("africa", 8888);

		map.forEach((key, value) -> {
			if (value == 5555) {
				System.out.println("country : " + key);
			}
		});
		System.out.println("=================================================");
		map.forEach((key, value) -> {
			System.out.println("country : " + key + "          code : " + value);
		});

		System.out.println("=================================================");
		map.forEach((key, value) -> {
			if (key.equalsIgnoreCase("india")) {

				System.out.println("code : " + value);
			}
		});

		Set<Entry<String, Integer>> set = map.entrySet();
		Iterator<Entry<String, Integer>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			Integer code = entry.getValue();
			String country = entry.getKey();
			if (code == 522) {
				System.out.println("passed code :  " + code);

				set.remove(country);
				System.out.println("removed country :  " + country);

			}

		}

//		System.out.println("=================================================");
//		map.forEach((key, value) -> {
//			if (value == 5555) {
//				map.remove(key);
//				System.out.println("removed country : " + key);
//
//			}
//		});

	}

}
