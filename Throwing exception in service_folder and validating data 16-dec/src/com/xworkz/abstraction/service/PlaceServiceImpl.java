package com.xworkz.abstraction.service;

import com.xworkz.abstraction.dto.PlaceDTO;
import com.xworkz.abstraction.repository.PlaceRepository;
import com.xworkz.abstraction.exception.InvalidDataException;

public class PlaceServiceImpl implements PlaceService {

	PlaceRepository repo;

	public PlaceServiceImpl(PlaceRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(PlaceDTO dto) throws InvalidDataException {

		System.out.println("running validateAndSave method in PlaceServiceImpl....");

		String name = dto.getName();
		String city = dto.getCity();
		String use = dto.getUse();
		String builtBy = dto.getBuiltBy();
		String state = dto.getState();

		boolean validName = false;
		boolean validCity = false;
		boolean validUse = false;
		boolean validBuiltBy = false;
		boolean validState = false;

		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("PlaceServiceImpl name is valid can be saved : " + name);
			validName = true;
		} else {
			System.err.println("invalid name : " + name);
		}
		
		
		if (city != null && city.length() >= 4 && city.length() <= 20) {
			System.out.println("PlaceServiceImpl city is valid can be saved : " + city);
			validCity = true;
		} else {
			System.err.println("invalid city : " + city);
		}
		
		
		if (use != null && use.length() >= 4 && use.length() <= 20) {
			System.out.println("PlaceServiceImpl use is valid can be saved : " + use);
			validUse = true;
		} else {
			System.err.println("invalid use : " + use);
		}
		
		
		if (builtBy != null && builtBy.length() >= 4 && builtBy.length() <= 20) {
			System.out.println("PlaceServiceImpl builtBy is valid can be saved : " + builtBy);
			validBuiltBy = true;
		} else {
			System.err.println("invalid builtBy : " + builtBy);
		}
		
		if (state != null && state.length() >= 4 && state.length() <= 20) {
			System.out.println("PlaceServiceImpl state is valid can be saved : " + state);
			validState = true;
		} else {
			System.err.println("invalid state : " + state);
		}

		if (validName && validCity && validUse && validBuiltBy && validState) {
			System.out.println("all data are valid can be saved ");
			boolean saved = repo.save(dto);
			System.out.println("is saved successfully? : " + saved);
			return true;
		} else {
			throw new InvalidDataException("data is invalid go and change data");
		}

	}

}
