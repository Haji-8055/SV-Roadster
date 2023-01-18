package com.xworkz.crud.boot;

import com.xworkz.crud.dto.BikeDTO;
import com.xworkz.crud.service.BikeService;
import com.xworkz.crud.service.BikeServiceImpl;

public class BikeRunner {

	public static void main(String[] args) {


		BikeDTO dto =new BikeDTO("ns0", "bajaj", 100, 125000);
		
		BikeService service=new BikeServiceImpl();
		service.validateAndSave(dto);
	}

}
