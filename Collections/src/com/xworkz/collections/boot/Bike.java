package com.xworkz.collections.boot;

import java.util.Collection;
import java.util.HashSet;

public class Bike {

	public static void main(String[] args) {

		String bike = "Kawasaki ZX10R";
		String bike1 = "Kawasaki Z900";
		String bike2 = "Kawasaki Z800";
		String bike3 = "Kawasaki Z650";
		String bike4 = "Kawasaki H2R";
		String bike5 = "Kawasaki H2";
		String bike6 = "Kawasaki Ninja 400";
		String bike7 = "Kawasaki Ninja 300";
		String bike8 = "Kawasaki versys";
		String bike9 = "Kawasaki Z900RS";
		String bike10 = "BMW s1000RR";
		String bike11 = "BMW s1000R";
		String bike12 = "BMW gs300";
		String bike13 = "BMW 1250gs";
		String bike14 = "BMW k1300r";
		String bike15 = "BMW R nine-T";
		String bike16 = "BMW R18";
		String bike17 = "Ducati V4";
		String bike18 = "Ducati 959 panigale";

		Collection<String> collection = new HashSet<String>();

		collection.add(bike);
		collection.add(bike1);
		collection.add(bike2);
		collection.add(bike3);
		collection.add(bike4);
		collection.add(bike5);
		collection.add(bike6);
		collection.add(bike7);
		collection.add(bike8);
		collection.add(bike9);
		collection.add(bike10);
		collection.add(bike11);
		collection.add(bike12);
		collection.add(bike13);
		collection.add(bike14);
		collection.add(bike15);
		collection.add(bike16);
		collection.add(bike17);
		collection.add(bike18);
		

		
		
		System.out.println(collection);
		System.out.println("size before clear method : " + collection.size());

		collection.clear();
		System.out.println("size after clear method : " + collection.size());

	}

}
