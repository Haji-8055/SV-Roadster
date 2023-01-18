package com.xworkz.save.repository;

import com.xworkz.save.dto.SoldierDTO;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class SoldierRepositoryImpl implements SoldierRepository {
	
	

	
	@Override
	public boolean save(SoldierDTO dto) {

		System.out.println("dto is saved : " + dto);

		return true;
	}

}
