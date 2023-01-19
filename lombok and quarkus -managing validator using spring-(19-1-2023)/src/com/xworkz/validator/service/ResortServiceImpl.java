package com.xworkz.validator.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.validator.dto.ResortDTO;
import com.xworkz.validator.dto.ResortDTO;
import com.xworkz.validator.repository.ResortRepo;

@Component
public class ResortServiceImpl  implements ResortService{

	@Autowired
	private Validator validator;

	private ResortRepo repo;

	@Autowired
	public ResortServiceImpl(ResortRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(ResortDTO dto) {
		System.out.println("running validateAndSave method of ResortServiceImpl......");

		Set<ConstraintViolation<ResortDTO>> errors = validator.validate(dto);
		if (errors.isEmpty()) {

			System.out.println("data is valid can be saved ");
			boolean saved = repo.save(dto);
			System.out.println("is dto saved : " + saved);
			return true;
		} else {
			System.err.println("data is inValid cannot be saved ");
			errors.forEach(e -> System.err.println(e.getMessage()));
			return false;
		}
	}

}
