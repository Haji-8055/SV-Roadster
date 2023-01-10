package com.xworkz.iterator.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftwareCompanies {

	public static void main(String[] args) {

		String company1 = "Infosys";
		String company2 = "ITC";
		String company3 = "Acer";
		String company4 = "TCS";
		String company5 = "Wipro";
		String company6 = "Oracle";
		String company7 = "cognizent";
		String company8 = "Amiti";
		String company9 = "Srin soft";
		String company10 = "Zensar";
		String company11 = "wolken";
		String company12 = "H B I";
		String company13 = "ICICLE";
		String company14 = "Xyka";
		String company15 = "Zensar";
		String company16 = "wolken";
		String company17 = "H B I";
		String company18 = "ICICLE";
		String company19 = "Xyka";
		String company20 = "Srin soft";

		Collection<String> companies = new ArrayList<String>();

		companies.add(company1);
		companies.add(company2);
		companies.add(company3);
		companies.add(company4);
		companies.add(company5);
		companies.add(company6);
		companies.add(company7);
		companies.add(company8);
		companies.add(company9);
		companies.add(company10);
		companies.add(company11);
		companies.add(company12);
		companies.add(company13);
		companies.add(company14);
		companies.add(company15);
		companies.add(company16);
		companies.add(company17);
		companies.add(company18);
		companies.add(company19);
		companies.add(company20);

		Iterator<String> iterable = companies.iterator();

		while (iterable.hasNext()) {

			String ref = iterable.next();
			iterable.remove();

			System.out.println(ref);

		}

	}

}
