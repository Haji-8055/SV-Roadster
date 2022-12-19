package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.dto.PlaceDTO;
import com.xworkz.abstraction.repository.PlaceRepository;
import com.xworkz.abstraction.exception.InvalidDataException;
import com.xworkz.abstraction.repository.PlaceRepositoryImpl;
import com.xworkz.abstraction.service.PlaceService;
import com.xworkz.abstraction.service.PlaceServiceImpl;

public class PlaceRunner {
	public static void main(String[] args) {

		PlaceDTO dto = new PlaceDTO("SYSTEM", null, null, null, "Vidhana soudha", "Bangalore", "government",
				"Sri K. Hanumanthaiya", "Karnataka");

		PlaceRepository repository = new PlaceRepositoryImpl();
		
		PlaceService service=new PlaceServiceImpl(repository);
		try {
			service.validateAndSave(dto);
		} catch (InvalidDataException e) {
			e.printStackTrace();
		}
	}

}
