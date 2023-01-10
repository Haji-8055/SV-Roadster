package com.xworkz.iterator.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Animals {

	public static void main(String[] args) {

		String animal1 = "lion";
		String animal2 = "tiger";
		String animal3 = "elephant";
		String animal4 = "deer";
		String animal5 = "gorilla";
		String animal6 = "fox";
		String animal7 = "wolf";
		String animal8 = "cow";
		String animal9 = "dog";
		String animal10 = "cat";

		Collection<String> animals = new ArrayList<String>();

		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		animals.add(animal5);
		animals.add(animal6);
		animals.add(animal7);
		animals.add(animal8);
		animals.add(animal9);
		animals.add(animal10);

		System.out.println("==========for each loop==============");

		for (String ref : animals) {// int i=0; i<animals.length; i++
			String ref1 = ref; // String ref1=animals[i];
			// animals.remove(ref);--->throws Exception in thread "main"
			// java.util.ConcurrentModificationException
			System.out.println(ref1);
		}

		Iterator<String> iterable = animals.iterator();

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
