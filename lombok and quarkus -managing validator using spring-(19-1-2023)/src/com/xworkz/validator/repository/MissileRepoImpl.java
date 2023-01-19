package com.xworkz.validator.repository;

import org.springframework.stereotype.Component;

import com.xworkz.validator.dto.MissileDTO;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component
public class MissileRepoImpl implements MissileRepo {

	@Override
	public boolean save(MissileDTO dto) {
		System.out.println("running save method of MissileRepoImpl ......");
		System.out.println("data is saved : "+dto);
		return true;
	}

}
