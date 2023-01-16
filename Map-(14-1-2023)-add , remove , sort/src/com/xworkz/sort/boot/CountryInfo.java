package com.xworkz.sort.boot;

import java.util.Map;
import java.util.TreeMap;

public class CountryInfo {

	public static void main(String[] args) {

		Map<String, String> map = new TreeMap<String, String>();// by default TreeMap implementation
		map.put("india", "draupadi Murmu"); // sort entries in ascending alpha order
		map.put("china", "Li Keqiang");
		map.put("kazakhstan", "Alikhan Smailov");
		map.put("saudi arabia", "Mohammed bin Salman");
		map.put("iran", "Hassan Rouhani");
		map.put("mangolia", "Khaltmaagiin Battulga");
		map.put("indonesia", "Joko Widodo");
		map.put("pakistan", "Arif Alvi");
		map.put("turkey", "Tayyip Erdogan");
		map.put("myanmar", "Myint Swe");
		map.put("afghanistan", "Mohammad Hassan Akhund");
		map.put("yemen", "Abdrabbuh Mansur Hadi");
		map.put("thailand", "Maha Vajiralongkorn");
		map.put("turkmenistan", "Gurbanguly");
		map.put("uzbekistan", "Shavkat Mirziyoyev");
		map.put("iraq", "Barham Salih");
		map.put("syria", "Barham Salih");
		map.put("nepal", "Bidhya Devi Bhandari");
		map.put("tajikistan", "Emomali Rahmon");
		map.put("maldives", "Ibrahim Mohamed Solih");

		System.out.println(map);

		map.forEach((key, value) -> {
			System.out.println("country : " + key + "              president : " + value);
		});

		map.keySet().forEach(key -> {
			if (key.length() > 10) {

				map.replace(key, "***new president***");
				System.out.println("updated country is : " + key);
			}
		});

		System.out.println("========================iterating after updating president==================");
		map.forEach((key, value) -> {
			System.out.println("country : " + key + "          president : " + value);
		});
	}

}
