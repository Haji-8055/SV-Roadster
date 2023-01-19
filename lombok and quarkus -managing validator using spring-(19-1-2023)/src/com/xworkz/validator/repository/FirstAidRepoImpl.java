package com.xworkz.validator.repository;

import org.springframework.stereotype.Component;

import com.xworkz.validator.dto.FirstAidDTO;

@Component
public class FirstAidRepoImpl implements FirstAidRepo {

	@Override
	public boolean save(FirstAidDTO dto) {
		System.out.println("running save method of FirstAidRepoImpl...");
		System.out.println("dto is saved : "+dto);
		return true;
	}

}
