package com.xworkz.dtos.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.dtos.dto.AirportDTO;

public class AirportRunner {
	
	public static void main(String[] args) {

		AirportDTO flight1=new AirportDTO("rajivgandhi", "hyderabad", 500);
		AirportDTO flight2=new AirportDTO("lokpriyaGopinath", "assam", 600);
		AirportDTO flight3=new AirportDTO("gaya", "bihar", 550);
		AirportDTO flight4=new AirportDTO("indiragandhi", "delhi", 500);
		AirportDTO flight5=new AirportDTO("cochin", "kerala", 300);
		AirportDTO flight6=new AirportDTO("guru ramdas", "punjab", 400);
		
		Collection<AirportDTO> collect=new ArrayList<AirportDTO>();
		collect.add(flight1);
		collect.add(flight2);
		collect.add(flight3);
		collect.add(flight4);
		collect.add(flight5);
		
		System.out.println(collect.contains(flight5));

	}


}
