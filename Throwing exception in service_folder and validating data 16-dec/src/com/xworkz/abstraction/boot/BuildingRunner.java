package com.xworkz.abstraction.boot;

import java.time.LocalDateTime;

import com.xworkz.abstraction.dto.BuildingDTO;
import com.xworkz.abstraction.exception.InvalidDataException;
import com.xworkz.abstraction.repository.BuildingRepository;
import com.xworkz.abstraction.repository.BuildingRepositoryImpl;
import com.xworkz.abstraction.service.BuildingService;
import com.xworkz.abstraction.service.BuildingServiceImpl;

public class BuildingRunner {

	public static void main(String[] args) {

		BuildingDTO buildingDTO = new BuildingDTO("SYSTEM", LocalDateTime.now(), null, null, 5, "WTC", 32, true, true,
				"office spaces");
		BuildingRepository repository = new BuildingRepositoryImpl();

		BuildingService service = new BuildingServiceImpl(repository);
		try {
			service.validateAndSave(buildingDTO);
		} catch (InvalidDataException e) {

			e.printStackTrace();
		}

	}

}
