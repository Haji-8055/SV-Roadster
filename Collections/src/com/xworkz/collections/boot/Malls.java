package com.xworkz.collections.boot;

import java.util.Collection;
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
		String mall14 = "Sarath City Capital Mall";
		String mall15 = "Lulu Mall Lucknow";
		String mall16 = "Lulu Mall Thiruvananthapuram";
		String mall17 = "DLF Mall of India";
		String mall18 = "Ambience Mall Gurgaon";
		String mall19 = "DB City Mall, Bhopal";
		String mall20 = "World Trade Park, Jaipur";
		String mall21 = "Hilite Mall, Calicut";
		String mall22 = "Nexus Ahmedabad One";
		String mall23 = "Amanora Mall, Magarpatta, Hadapsar";
		String mall24 = "Ambience Mall, Vasant Kunj";
		String mall25 = "R City Mall";
		String mall26 = "Elante Mall";
		String mall27 = "Magneto the mall";
		String mall28 = "The Great India Place";
		String mall29 = "South City Mall";
		String mall30 = "Viviana Mall";
		String mall31 = "VR Chennai";
		String mall32 = "Esplanade One";
		String mall33 = "The Grand Venice Mall";
		String mall34 = "City Centre, Nashik";
		String mall35 = "Z Square Mall";
		String mall36 = "Express Avenue";
		String mall37 = "Phoenix Palassio";
		String mall38 = "Infiniti Mall, Malad";
		String mall39 = "Inorbit Mall, Cyberabad";
		String mall40 = "Acropolis Mall";

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
		collection.add(mall19);
		collection.add(mall20);
		collection.add(mall21);
		collection.add(mall22);
		collection.add(mall23);
		collection.add(mall24);
		collection.add(mall25);
		collection.add(mall26);
		collection.add(mall27);
		collection.add(mall28);
		collection.add(mall29);
		collection.add(mall30);
		collection.add(mall31);
		collection.add(mall32);
		collection.add(mall33);
		collection.add(mall34);
		collection.add(mall35);
		collection.add(mall36);
		collection.add(mall37);
		collection.add(mall38);
		collection.add(mall39);
		collection.add(mall40);

		System.out.println(collection);
		System.out.println("size before clear method : " + collection.size());

		collection.clear();
		System.out.println("size after clear method : " + collection.size());

	}

}
