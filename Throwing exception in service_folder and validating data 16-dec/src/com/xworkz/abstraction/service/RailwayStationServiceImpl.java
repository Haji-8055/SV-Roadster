package com.xworkz.abstraction.service;

import com.xworkz.abstraction.dto.RailwayStationDTO;
import com.xworkz.abstraction.exception.InvalidDataException;
import com.xworkz.abstraction.repository.RailwayStationRepository;

public class RailwayStationServiceImpl implements RailwayStationService {

	RailwayStationRepository repo;

	public RailwayStationServiceImpl(RailwayStationRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(RailwayStationDTO dto) throws InvalidDataException {
		System.out.println("running validateAndSave method in RailwayStationServiceImpl....");

		String name = dto.getName();
		int platform = dto.getNoOfPlatforms();
		double price = dto.getPlatformTicketPrice();
		double area = dto.getArea();

		boolean validName = false;
		boolean validPlatform = false;
		boolean validPrice = false;
		boolean validArea = false;

		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("RailwayStation name is valid can be saved : " + name);
			validName = true;
		} else {
			System.err.println("invalid name : " + name);
		}

		if (platform >= 1 && platform <= 10) {
			System.out.println("RailwayStation platform is valid can be saved : " + platform);
			validPlatform = true;
		} else {
			System.err.println("invalid platform : " + platform);
		}

		if (price >= 1 && price <= 10) {
			System.out.println("RailwayStation price is valid can be saved : " + price);
			validPrice = true;
		} else {
			System.err.println("invalid price : " + price);
		}

		if (area >= 1 && area <= 10) {
			System.out.println("RailwayStation area is valid can be saved : " + area);
			validArea = true;
		} else {
			System.err.println("invalid area : " + area);
		}

		if (validName && validPlatform && validPrice && validArea) {
			System.out.println("all data are valid can be saved ");
			boolean saved = repo.save(dto);
			System.out.println("is saved successfully? : " + saved);
			return true;
		} else {
			throw new InvalidDataException("data is invalid go and change data");
		}

	}

}
