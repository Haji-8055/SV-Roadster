package com.xworkz.iterator.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MetroCity {

	public static void main(String[] args) {// 5

		String city1 = "Bangalore";
		String city2 = "Hyderabad";
		String city3 = "mumbai";
		String city4 = "delhi";
		String city5 = "kolkata";

		Collection<String> cities = new ArrayList<String>();

		cities.add(city1);
		cities.add(city2);
		cities.add(city3);
		cities.add(city4);
		cities.add(city5);

		System.out.println("==========for each loop==============");

		for (String ref : cities) {// int i=0; i<citys.length; i++
			String ref1 = ref; // String ref1=citys[i];
			// citys.remove(ref);--->throws Exception in thread "main"
			// java.util.ConcurrentModificationException
			System.out.println(ref1);
		}

		Iterator<String> iterable = cities.iterator();

		System.out.println("==========iterator==============");

		while (iterable.hasNext()) {

			String ref = iterable.next();
			iterable.remove();
			System.out.println("element : " + ref);
			System.out.println("element exist : " + iterable.hasNext());

		}

		System.out.println("==========iterator after remove==============");

		while (iterable.hasNext()) {

			String ref = iterable.next();
			iterable.remove();
			System.out.println("element : " + ref);
			System.out.println("element exist : " + iterable.hasNext());

		}

	}

}
