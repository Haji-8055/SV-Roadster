package com.xworkz.abstraction.boot;

import java.time.LocalDateTime;

import com.xworkz.abstraction.dto.TheatreDTO;
import com.xworkz.abstraction.exception.InvalidDataException;
import com.xworkz.abstraction.repository.TheatreRepository;
import com.xworkz.abstraction.repository.TheatreRepositoryImpl;
import com.xworkz.abstraction.service.TheatreService;
import com.xworkz.abstraction.service.TheatreServiceImpl;

public class TheatreRunner {

	public static void main(String[] args) {

		TheatreDTO dto = new TheatreDTO("SYSTEM", LocalDateTime.now(), null, null, "#8G", "Navrang", "local", 500);

		TheatreRepository repository = new TheatreRepositoryImpl();

		TheatreService service = new TheatreServiceImpl(repository);

		TheatreDTO dto1 = new TheatreDTO("SYSTEM", LocalDateTime.now(), null, null, "#blr268G", "Navrang", "local",
				500);

		TheatreDTO dto2 = new TheatreDTO("SYSTEM", LocalDateTime.now(), null, null, "#blr268G", "Navrang", "local",
				500);

		TheatreDTO dto3 = new TheatreDTO("SYSTEM", LocalDateTime.now(), null, null, "#blr268G", "Navrang", "local",
				500);

		TheatreDTO dto4 = new TheatreDTO("SYSTEM", LocalDateTime.now(), null, null, "#blr268G", "Navrang", "local",
				500);
		TheatreDTO dto5 = new TheatreDTO("SYSTEM", LocalDateTime.now(), null, null, "#blr268G", "Navrang", "local", 500);

		try {
			service.validateAndSave(dto);
			
//			service.validateAndSave(dto1);
//			service.validateAndSave(dto2); throws -->StorageFullException
//			service.validateAndSave(dto3);
//			service.validateAndSave(dto4);
//			service.validateAndSave(dto5);

		} catch (InvalidDataException e) {
			e.printStackTrace();
		}

	}

}
