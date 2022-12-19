package com.xworkz.abstraction.repository;

import com.xworkz.abstraction.dto.BuildingDTO;
import com.xworkz.abstraction.exception.StorageFullException;

public class BuildingRepositoryImpl implements BuildingRepository {

	private BuildingDTO[] dtos = new BuildingDTO[4];
	private int index = 0;

	@Override
	public boolean save(BuildingDTO dto) {

		System.out.println("running save method in BuildingRepositoryImpl....");

		if (index >= dtos.length) {
			throw new StorageFullException("cannot add more dtos to array,the last index is " + index);
		}
		dtos[index] = dto;
		index++;
		System.out.println("value saved at index : " + index + " is : " + dto);

		return true;
	}

}
