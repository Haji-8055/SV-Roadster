package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;

public class Sweet {

	public static void main(String[] args) {

		String sweetName = "Gulab Jamun";
		String sweetName1 = "Rasgulla";
		String sweetName2 = "Jalebi";
		String sweetName3 = "kaju katli";
		String sweetName4 = "boondi";
		String sweetName5 = "mysore pak";
		String sweetName6 = "soan papdi";
		String sweetName7 = "khawa peda";
		String sweetName8 = "khanakan";
		String sweetName9 = "undi";
		String sweetName10 = "holige";
		String sweetName11 = "barfi";
		String sweetName12 = "jelly";
		String sweetName13 = "sheer khurma";

		Collection<String> collection = new ArrayList<String>();

		collection.add(sweetName);
		collection.add(sweetName1);
		collection.add(sweetName2);
		collection.add(sweetName3);
		collection.add(sweetName4);
		collection.add(sweetName5);
		collection.add(sweetName6);
		collection.add(sweetName7);
		collection.add(sweetName8);
		collection.add(sweetName9);
		collection.add(sweetName10);
		collection.add(sweetName11);
		collection.add(sweetName12);
		collection.add(sweetName13);
		
		System.out.println(collection);
		System.out.println("size before clear method : " + collection.size());

		collection.clear();
		System.out.println("size after clear method : " + collection.size());

	}

}
