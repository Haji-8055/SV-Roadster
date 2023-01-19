package com.xworkz.validator.repository;

import org.springframework.stereotype.Component;

import com.xworkz.validator.dto.ResortDTO;

@Component
public class ResortRepoImpl implements ResortRepo {

	@Override
	public boolean save(ResortDTO dto) {
		System.out.println("running save mehtod of ResortRepoImpl...");
		System.out.println("dto is save : "+dto);

		return true;
	}

}
