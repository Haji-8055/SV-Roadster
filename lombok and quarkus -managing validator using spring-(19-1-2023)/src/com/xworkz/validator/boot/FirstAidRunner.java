package com.xworkz.validator.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.validator.configuration.SpringConfiguration;
import com.xworkz.validator.dto.FirstAidDTO;
import com.xworkz.validator.service.FirstAidService;

public class FirstAidRunner {

	public static void main(String[] args) {

		FirstAidDTO dto = new FirstAidDTO("hospital", "white", 12);
		FirstAidDTO dto1 = new FirstAidDTO("college", "in", 8);
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		FirstAidService service = spring.getBean(FirstAidService.class);
		service.validateAndSave(dto);
		service.validateAndSave(dto1);
	}

}
