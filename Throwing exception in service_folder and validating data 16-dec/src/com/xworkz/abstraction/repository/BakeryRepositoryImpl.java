package com.xworkz.abstraction.repository;

import com.xworkz.abstraction.dto.BakeryDTO;
import com.xworkz.abstraction.exception.StorageFullException;

public class BakeryRepositoryImpl implements BakeryRepository {

	BakeryDTO[] dtos = new BakeryDTO[5];
	private int index = 0;

	@Override
	public boolean save(BakeryDTO bakeryDTO) {

		System.out.println("running save method in BakeryRepositoryImpl....");

		if (index >= dtos.length) {
			throw new StorageFullException("cannot add more dtos to array,the last index is " + index);
		}
		dtos[index] = bakeryDTO;
		index++;
		System.out.println("value saved at index : " + index + " is : " + bakeryDTO);

		return true;
	}

}
