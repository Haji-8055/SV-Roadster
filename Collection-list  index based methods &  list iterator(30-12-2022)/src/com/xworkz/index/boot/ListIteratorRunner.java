package com.xworkz.index.boot;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorRunner {
	
	
	public static void main(String[] args) {
		
		List<String> colors=new LinkedList();
		colors.add("red");
		colors.add("blue");
		colors.add("yellow");//initial index 2 
		colors.add("purple");
		colors.add("green");
		colors.add("orange");
		System.out.println("original list==============");
		System.out.println(colors);

		System.out.println("after adding new element==============");
		colors.add(2, "black");//adds new element at given index,,index of yellow moves to 3
		System.out.println(colors);

		System.out.println("after updating==============");
		colors.set(1, "white");//updates value at given index
		System.out.println(colors);

		System.out.println("after remove==============");
		colors.remove(2);
		System.out.println(colors);
		
		System.out.println("iterating from top..................");
		
		ListIterator<String> listIterator=colors.listIterator();
		
		while (listIterator.hasNext()) {
			String string =  listIterator.next();
			System.out.println(string);
			
		}
		
		System.out.println("iterating from below..................");
		ListIterator<String> listIterator1=colors.listIterator(colors.size());

		while (listIterator1.hasPrevious()) {
			String string =  listIterator1.previous();
			System.out.println(string);
			
		}
		
		
		System.out.println("iterating from random index..................");
		ListIterator<String> listIterator2=colors.listIterator(3);

		while (listIterator2.hasPrevious()) {
			String string =  listIterator2.previous();
			System.out.println(string);
			
		}
		
	}

}
