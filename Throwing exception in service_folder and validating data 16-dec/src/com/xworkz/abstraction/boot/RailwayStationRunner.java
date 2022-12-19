package com.xworkz.abstraction.boot;

import java.time.LocalDateTime;

import com.xworkz.abstraction.dto.RailwayStationDTO;
import com.xworkz.abstraction.exception.InvalidDataException;
import com.xworkz.abstraction.repository.RailwayStationRepository;
import com.xworkz.abstraction.repository.RailwayStationRepositoryImpl;
import com.xworkz.abstraction.service.RailwayStationService;
import com.xworkz.abstraction.service.RailwayStationServiceImpl;

public class RailwayStationRunner {

	public static void main(String[] args) {

		RailwayStationDTO dto = new RailwayStationDTO("SYSTEM", LocalDateTime.now(), null, null, "bagalkot", 3, 2.4,
				10);

		RailwayStationRepository repository = new RailwayStationRepositoryImpl();

		RailwayStationService service = new RailwayStationServiceImpl(repository);
		
		try {
			service.validateAndSave(dto);
		} catch (InvalidDataException e) {
			
			e.printStackTrace();
		}

	}

}
