package com.xworkz.validator.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.validator.configuration.SpringConfiguration;
import com.xworkz.validator.dto.ResortDTO;
import com.xworkz.validator.service.ResortService;

public class ResortRunner {

	public static void main(String[] args) {

		ResortDTO dto = new ResortDTO("kanthi", "bagalkot", 1800);
		ResortDTO dto1 = new ResortDTO("prithvi", "in", 6000000);
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		ResortService service = spring.getBean(ResortService.class);
		service.validateAndSave(dto);
		service.validateAndSave(dto1);
	}

}
