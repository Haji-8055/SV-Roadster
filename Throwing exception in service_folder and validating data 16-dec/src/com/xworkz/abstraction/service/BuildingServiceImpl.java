package com.xworkz.abstraction.service;

import com.xworkz.abstraction.dto.BuildingDTO;
import com.xworkz.abstraction.exception.InvalidDataException;
import com.xworkz.abstraction.repository.BuildingRepository;

public class BuildingServiceImpl implements BuildingService {

	BuildingRepository repo;

	public BuildingServiceImpl(BuildingRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(BuildingDTO dto) throws InvalidDataException {

		System.out.println("running validateAndSave method in BuildingServiceImpl....");
		int no = dto.getNo();
		String name = dto.getName();
		int floors = dto.getFloors();
		String type = dto.getType();

		boolean validNo = false;
		boolean validName = false;
		boolean validFloors = false;
		boolean validType = false;

		if (no >= 1 && no <= 10) {
			System.out.println("building no is valid can be saved : " + no);
			validNo = true;
		} else {
			System.err.println("invalid no : " + no);
		}

		if (name != null && name.length() >= 3 && name.length() <= 20) {
			System.out.println("building name is valid can be saved : " + name);
			validName = true;
		} else {
			System.err.println("invalid name : " + name);
		}

		if (floors >= 1 && floors <= 90) {
			System.out.println("building floors is valid can be saved : " + floors);
			validFloors = true;
		} else {
			System.err.println("invalid floors : " + floors);
		}

		if (type != null && type.length() >= 1 && type.length() <= 30) {
			System.out.println("building type is valid can be saved : " + type);
			validType = true;
		} else {
			System.err.println("invalid type : " + type);
		}

		if (validNo && validName && validFloors && validType) {
			System.out.println("all data are valid can be saved ");
			boolean saved = repo.save(dto);
			System.out.println("is saved successfully? : " + saved);
			return true;
		} else {
			throw new InvalidDataException("data is invalid go and change data");
		}

	}

}
