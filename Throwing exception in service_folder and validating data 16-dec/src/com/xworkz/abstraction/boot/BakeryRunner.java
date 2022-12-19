package com.xworkz.abstraction.boot;

import java.time.LocalDateTime;

import com.xworkz.abstraction.dto.BakeryDTO;
import com.xworkz.abstraction.exception.InvalidDataException;
import com.xworkz.abstraction.repository.BakeryRepository;
import com.xworkz.abstraction.repository.BakeryRepositoryImpl;
import com.xworkz.abstraction.service.BakeryService;
import com.xworkz.abstraction.service.BakeryServiceImpl;

public class BakeryRunner {

	public static void main(String[] args) {

		BakeryDTO dto = new BakeryDTO("SYSTEM", LocalDateTime.now(), null, null, "variar", "govinda", "Bangalore",
				"cookies",66561565L);

		BakeryRepository repository = new BakeryRepositoryImpl();

		BakeryService service = new BakeryServiceImpl(repository);

		try {
			service.validateAndSave(dto);
		} catch (InvalidDataException e) {
			e.printStackTrace();
		}

	}

}
