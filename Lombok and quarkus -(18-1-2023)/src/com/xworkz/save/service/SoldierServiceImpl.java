package com.xworkz.save.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.save.dto.SoldierDTO;
import com.xworkz.save.repository.SoldierRepository;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class SoldierServiceImpl implements SoldierService {

	@NonNull
	private SoldierRepository repo;

	@Override
	public boolean validateAndSave(SoldierDTO dto) {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> set = validator.validate(dto);
		
		if (!set.isEmpty()) {
			
			System.err.println("data is invalid cannot be saved");
			set.forEach(e -> System.out.println(e.getMessage()));
			return false;

		} 
		else {
			System.out.println("data is valid can be saved");
			boolean isSaved = repo.save(dto);
			System.out.println("data saved in repository : " + isSaved);
			return true;

		}

	}

}
