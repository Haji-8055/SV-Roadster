package com.xworkz.iterator.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoeSize {

	public static void main(String[] args) {// 15

		int shoe1 = 5;
		int shoe2 = 8;
		int shoe3 = 6;
		int shoe4 = 4;
		int shoe5 = 7;
		int shoe6 = 10;
		int shoe7 = 5;
		int shoe8 = 5;
		int shoe9 = 6;
		int shoe10 = 5;
		int shoe11 = 7;
		int shoe12 = 6;
		int shoe13 = 8;
		int shoe14 = 9;
		int shoe15 = 7;

		Collection<Integer> shoe = new ArrayList<Integer>();

		shoe.add(shoe1);
		shoe.add(shoe2);
		shoe.add(shoe3);
		shoe.add(shoe4);
		shoe.add(shoe5);
		shoe.add(shoe6);
		shoe.add(shoe7);
		shoe.add(shoe8);
		shoe.add(shoe9);
		shoe.add(shoe10);
		shoe.add(shoe11);
		shoe.add(shoe12);
		shoe.add(shoe13);
		shoe.add(shoe14);
		shoe.add(shoe15);
		

		System.out.println("==========for each loop==============");

		for (int ref : shoe) {// int i=0; i<shoe.length; i++
			int ref1 = ref; // int ref1=shoe[i];
														// sizes.remove(ref);--->throws Exception in thread "main"
														// java.util.ConcurrentModificationException
			System.out.println(ref1);
		}

		Iterator<Integer> iterable = shoe.iterator();

		System.out.println("==========iterator==============");

		while (iterable.hasNext()) {

			int ref = iterable.next();
			iterable.remove();
			System.out.println("element : " + ref);
			System.out.println("element exist : " + iterable.hasNext());

		}

		System.out.println("==========iterator after remove==============");

		while (iterable.hasNext()) {

			int ref = iterable.next();
			iterable.remove();
			System.out.println("element : " + ref);
			System.out.println("element exist : " + iterable.hasNext());

		}

	}

}
