package com.xworkz.iterator.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Watch {

	public static void main(String[] args) {//5
		
		String watch1 = "Rolex";
		String watch2 = "Rado";
		String watch3 = "TITAN";
		String watch4 = "casio";
		String watch5 = "fastrack";
		
		Collection<String> watches = new ArrayList<String>();

		watches.add(watch1);
		watches.add(watch2);
		watches.add(watch3);
		watches.add(watch4);
		watches.add(watch5);
		
		System.out.println("==========for each loop==============");

		for (String ref : watches) {// int i=0; i<watchs.length; i++
			String ref1 = ref; // String ref1=watchs[i];
			// watchs.remove(ref);--->throws Exception in thread "main" java.util.ConcurrentModificationException
			System.out.println(ref1);
		}

		Iterator<String> iterable = watches.iterator();

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
