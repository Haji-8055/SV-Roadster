package com.xworkz.abstraction.repository;

import com.xworkz.abstraction.dto.PlaceDTO;
import com.xworkz.abstraction.exception.StorageFullException;

public class PlaceRepositoryImpl implements PlaceRepository {

	private PlaceDTO[] dtos = new PlaceDTO[5];
	private int index = 0;

	@Override
	public boolean save(PlaceDTO dto) {

		System.out.println("running save method in PlaceRepositoryImpl....");

		if (index >= dtos.length) {
			throw new StorageFullException("cannot add more dtos to array,the last index is " + index);
		}
		dtos[index] = dto;
		index++;
		System.out.println("value saved at index : " + index + " is : " + dto);

		return true;
	}

}
