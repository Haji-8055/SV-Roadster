package com.xworkz.abstraction.repository;

import com.xworkz.abstraction.dto.TheatreDTO;
import com.xworkz.abstraction.exception.StorageFullException;

public class TheatreRepositoryImpl implements TheatreRepository {

	private TheatreDTO[] dtos = new TheatreDTO[5];

	private int index = 0;

	@Override
	public boolean save(TheatreDTO dto) {

		System.out.println("Running save method of TheatreRepositoryImpl ");

		if (index >= dtos.length) {
			throw new StorageFullException("cannot add more dtos to array,the last index is "+index);
		}

		dtos[index] = dto;
		index++;

		System.out.println("value saved at index : " + index + " is : " + dto);

		return true;
	}

}
