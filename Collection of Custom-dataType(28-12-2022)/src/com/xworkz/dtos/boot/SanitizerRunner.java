package com.xworkz.dtos.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.dtos.dto.SanitizerDTO;

public class SanitizerRunner {

	public static void main(String[] args) {

		SanitizerDTO dto1 = new SanitizerDTO("sameer", "savlon", "orange", 25);
		SanitizerDTO dto2 = new SanitizerDTO("Rhitik", "Godrej", "blue", 45);
		SanitizerDTO dto3 = new SanitizerDTO("govinda", "dabur", "green", 30);
		SanitizerDTO dto4 = new SanitizerDTO("rajiv", "Multani", "red", 50);
		SanitizerDTO dto5 = new SanitizerDTO("ramdev baba", "Corvil", "yellow", 4);
		SanitizerDTO dto6 = new SanitizerDTO("akshayKumar", "lifebuoy", "pink", 48);
		SanitizerDTO dto7 = new SanitizerDTO("srk", "springBliss", "yellow", 35);
		SanitizerDTO dto8 = new SanitizerDTO("dhoni", "Zuci", "sky Blue", 28);
		SanitizerDTO dto9 = new SanitizerDTO("kohli", "Resil", "orange", 20);
		SanitizerDTO dto10 = new SanitizerDTO("akshayKumar", "dettol", "voilet", 45);

		Collection<SanitizerDTO> collection = new ArrayList<SanitizerDTO>();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		collection.add(dto8);
		collection.add(dto9);
		collection.add(dto10);

		Iterator<SanitizerDTO> iterator = collection.iterator();

		while (iterator.hasNext()) {
			SanitizerDTO sanitizerDTO = iterator.next();

			// 1. price check
			int price = sanitizerDTO.getPrice();
			if (price > 5) {
				System.out.println("the sanitizer price is above 5 : " + sanitizerDTO);
			} else {
				System.err.println("the price of sanitizer is less than 5 : " + sanitizerDTO);
			}
			// 2. null check
			if (sanitizerDTO.getAmbassador() == null || sanitizerDTO.getBrand() == null
					|| sanitizerDTO.getColour() == null) {
				System.out.println("sanitizer with null value is : " + sanitizerDTO);
			}

		}
		System.out.println();
		System.out.println("==========================checking for least price======================");
		// 3.min price
		SanitizerDTO dto = ((ArrayList<SanitizerDTO>) collection).get(0);

		for (SanitizerDTO sanDTO : collection) {
			if (sanDTO.getPrice() < dto.getPrice()) {
				dto = sanDTO;
			}

		}
		System.out.println("least price is : " + dto.getPrice() + " and sanitizer is : " + dto);

		System.out.println();
		System.out.println("==========================checking for max price======================");
		
		// 4.max price
		SanitizerDTO sanitizerDTO = ((ArrayList<SanitizerDTO>) collection).get(0);

		for (SanitizerDTO sanDTO : collection) {
			if (sanDTO.getPrice() > sanitizerDTO.getPrice()) {
				sanitizerDTO = sanDTO;
			}

		}
		System.out.println("max price is : " + sanitizerDTO.getPrice() + " and sanitizer is : " + sanitizerDTO);
		
		

		System.out.println();
		System.out.println("==========================checking for 2nd max price======================");


		SanitizerDTO ref = ((ArrayList<SanitizerDTO>) collection).get(0);

		for (SanitizerDTO sanitizerDTO21 : collection) {

			if (sanitizerDTO21.getPrice() > ref.getPrice() && sanitizerDTO21.getPrice() < sanitizerDTO.getPrice()) {
				ref = sanitizerDTO21;
			}

		}
		System.out.println("second highest number is : "+ref.getPrice()+" and sanitizer "+ref);


	}

}
