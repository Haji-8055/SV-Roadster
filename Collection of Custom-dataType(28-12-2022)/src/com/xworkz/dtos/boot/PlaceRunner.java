package com.xworkz.dtos.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.dtos.dto.PlaceDTO;

public class PlaceRunner {
	
	
	public static void main(String[] args) {
		
		PlaceDTO dto1=new PlaceDTO("gadag", false, 50000, "cotton");
		PlaceDTO dto2=new PlaceDTO("bagalkot", true, 65000, "sugarcane");
		PlaceDTO dto3=new PlaceDTO("bangalore", false, 100000, "rice");
		PlaceDTO dto4=new PlaceDTO("gulbarga", true, 80000, "tur");
		PlaceDTO dto5=new PlaceDTO("guledgudd", false, 5000, "jowar");

		Collection<PlaceDTO> collect=new ArrayList<PlaceDTO>();
		collect.add(dto1);
		collect.add(dto2);
		collect.add(dto3);
		collect.add(dto4);
		collect.add(dto5);
		
		PlaceDTO dto6=new PlaceDTO("bgk", false, 6000, "jowar");

		
		System.out.println(collect.contains(dto6));
		


	}


}
