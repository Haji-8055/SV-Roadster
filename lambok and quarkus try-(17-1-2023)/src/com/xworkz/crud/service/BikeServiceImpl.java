package com.xworkz.crud.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.crud.dto.BikeDTO;

public class BikeServiceImpl implements BikeService {

	@Override
	public boolean validateAndSave(BikeDTO dto) {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<BikeDTO>> errors = validator.validate(dto);

		if (!errors.isEmpty()) {
			System.out.println("there is error in data...");
			errors.forEach(e -> System.err.println(e.getMessage()));
			return false;
		}

		System.out.println("all data are valid...");
		return true;

	}

}
