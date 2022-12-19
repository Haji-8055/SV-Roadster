package com.xworkz.pizza.repository;

import com.xworkz.pizza.dto.HelmetDTO;
import com.xworkz.pizza.exception.ArraySizeExceededException;

public class HelmetRepositoryImpl implements HelmetRepository {

	private HelmetDTO[] dtos = new HelmetDTO[5];
	private int index = 0;

	@Override
	public boolean save(HelmetDTO dto) {

		if (this.index >= this.dtos.length) {
			throw new ArraySizeExceededException();
		}

		this.dtos[index] = dto;
		this.index++;

		return true;
	}

}
