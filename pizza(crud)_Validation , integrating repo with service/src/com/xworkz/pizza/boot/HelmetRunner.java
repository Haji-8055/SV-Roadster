package com.xworkz.pizza.boot;

import java.time.LocalDateTime;

import com.xworkz.pizza.constant.Color;
import com.xworkz.pizza.constant.HelmetType;
import com.xworkz.pizza.dto.HelmetDTO;
import com.xworkz.pizza.repository.HelmetRepository;
import com.xworkz.pizza.repository.HelmetRepositoryImpl;
import com.xworkz.pizza.service.HelmetService;
import com.xworkz.pizza.service.HelmetServiceImpl;

public class HelmetRunner {

	public static void main(String[] args) {

		HelmetDTO dto = new HelmetDTO("System", LocalDateTime.now(), null, null, "vega", HelmetType.FULL,
				Color.MIXED_GRAPHICS, 2800d);
		
		HelmetRepository repo=new HelmetRepositoryImpl();
		HelmetService helmetService=new HelmetServiceImpl(repo);
		
		helmetService.validateAndSave(dto);
	}

}
