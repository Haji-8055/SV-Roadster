package com.xworkz.collections.boot;

import java.util.Collection;
import java.util.LinkedList;

public class Currencies {

	public static void main(String[] args) {
		
		String currency = "Russian ruble";
		String currency1 = "Afghan afghani";
		String currency2 = "Euro";
		String currency3 = "Albanian lek";
		String currency4 = "Guernsey pound";
		String currency5 = "Algerian dinar";
		String currency6 = "Angolan kwanza";
		String currency7 = "Eastern Caribbean dollar";
		String currency8 = "Argentine peso";
		String currency9 = "Armenian dram";
		String currency10 = "Aruban florin";
		String currency11 = "Saint Helena pound";
		String currency12 = "Australian dollar";
		String currency13 = "Azerbaijani manat";
		String currency14 = "Bahamian dollar";
		String currency15 = "Bahraini dinar";
		String currency16 = "Bangladeshi taka";
		String currency17 = "Barbadian dollar";
		String currency18 = "Belarusian ruble";
		String currency19 = "Bhutanese ngultrum";
		String currency20 = "Bolivian boliviano";
		String currency21 = "United States dollar";
		String currency22 = "Bulgarian lev";
		String currency23 = "Central African CFA franc";
		String currency24 = "Canadian dollar";
		String currency25 = "Cayman Islands dollar";
		String currency26 = "Chilean peso";

		Collection<String> collection = new LinkedList<String>();
		
		collection.add(currency);
		collection.add(currency1);
		collection.add(currency2);
		collection.add(currency3);
		collection.add(currency4);
		collection.add(currency5);
		collection.add(currency6);
		collection.add(currency7);
		collection.add(currency8);
		collection.add(currency9);
		collection.add(currency10);
		collection.add(currency11);
		collection.add(currency12);
		collection.add(currency13);
		collection.add(currency14);
		collection.add(currency15);
		collection.add(currency16);
		collection.add(currency17);
		collection.add(currency18);
		collection.add(currency19);
		collection.add(currency20);
		collection.add(currency21);
		collection.add(currency22);
		collection.add(currency23);
		collection.add(currency24);
		collection.add(currency25);
		collection.add(currency26);

		System.out.println(collection);
		System.out.println("size before clear method : " + collection.size());

		collection.clear();
		System.out.println("size after clear method : " + collection.size());

	}

}
