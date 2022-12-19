package com.xworkz.abstraction.repository;

import com.xworkz.abstraction.dto.RailwayStationDTO;
import com.xworkz.abstraction.exception.StorageFullException;

public class RailwayStationRepositoryImpl implements RailwayStationRepository {

	private RailwayStationDTO[] dtos = new RailwayStationDTO[5];
	private int index = 0;

	@Override
	public boolean save(RailwayStationDTO dto) {
		System.out.println("running save method in RailwayStationRepositoryImpl....");

		if (index >= dtos.length) {
			throw new StorageFullException("cannot add more dtos to array,the last index is " + index);
		}
		dtos[index] = dto;
		index++;
		System.out.println("value saved at index : " + index + " is : " + dto);

		return true;
	}

}
