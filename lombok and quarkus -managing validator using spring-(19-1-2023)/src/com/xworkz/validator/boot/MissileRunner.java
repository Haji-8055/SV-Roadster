package com.xworkz.validator.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.validator.configuration.SpringConfiguration;
import com.xworkz.validator.dto.MissileDTO;
import com.xworkz.validator.service.MissileService;

public class MissileRunner {

	public static void main(String[] args) {

		MissileDTO dto = new MissileDTO("prithvi", "india", "prithvi", 1983);
		MissileDTO dto1 = new MissileDTO("prithvi", "in", "prithvi", 1983);
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		MissileService service = spring.getBean(MissileService.class);
		service.validateAndSave(dto);
		service.validateAndSave(dto1);
	}

}
