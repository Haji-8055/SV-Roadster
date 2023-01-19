package com.xworkz.validator.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.validator.dto.MissileDTO;
import com.xworkz.validator.repository.MissileRepo;

import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
public class MissileServiceImpl implements MissileService {

	@Autowired
	private Validator validator;

	private MissileRepo repo;

	@Autowired
	public MissileServiceImpl(MissileRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(MissileDTO dto) {
		System.out.println("running validateAndSave method of MissileServiceImpl......");

		Set<ConstraintViolation<MissileDTO>> errors = validator.validate(dto);
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
