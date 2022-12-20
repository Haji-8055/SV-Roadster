package com.xworkz.collections.boot;

import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class Malls {

	public static void main(String[] args) {

		String mall1 = "LULU mall";
		String mall2 = "GT mall";
		String mall3 = "ORION mall";
		String mall4 = "MANTRI mall";
		String mall5 = "GARUDA mall";
		String mall6 = "FORUM mall";
		String mall7 = "MG ROAD mall";
		String mall8 = "NEXUS mall";
		String mall9 = "U mall";
		String mall10 = "FORUM mall KENGERI";
		String mall11 = "DLF EMPORIO mall";
		String mall12 = "BRIGADE mall";
		String mall13 = "BANGALORE mall";
		String mall14 = "LULU mall";
		String mall15 = "LULU mall";
		String mall16 = "LULU mall";
		String mall17 = "LULU mall";
		String mall18 = "LULU mall";
		String mall19 = "LULU mall";
		String mall20 = "LULU mall";
		String mall21 = "LULU mall";
		String mall22 = "LULU mall";
		String mall23 = "LULU mall";
		String mall24 = "LULU mall";
		String mall25 = "LULU mall";
		String mall26 = "LULU mall";
		String mall27 = "LULU mall";
		String mall28 = "LULU mall";
		String mall29 = "LULU mall";
		String mall30 = "LULU mall";
		String mall31 = "LULU mall";
		String mall32 = "LULU mall";
		String mall33 = "LULU mall";
		String mall34 = "LULU mall";
		String mall35 = "LULU mall";
		String mall36 = "LULU mall";

		Collection<String> collection = new TreeSet<String>();

		collection.add(mall1);
		collection.add(mall2);
		collection.add(mall3);
		collection.add(mall4);
		collection.add(mall5);
		collection.add(mall6);
		collection.add(mall7);
		collection.add(mall8);
		collection.add(mall9);
		collection.add(mall10);
		collection.add(mall11);
		collection.add(mall12);
		collection.add(mall13);
		collection.add(mall14);
		collection.add(mall15);
		collection.add(mall16);
		collection.add(mall17);
		collection.add(mall18);

		System.out.println(collection);
		System.out.println("size before clear method : " + collection.size());

		collection.clear();
		System.out.println("size after clear method : " + collection.size());

	}

}
