package com.xworkz.abstraction.service;

import com.xworkz.abstraction.dto.TheatreDTO;
import com.xworkz.abstraction.exception.InvalidDataException;
import com.xworkz.abstraction.repository.TheatreRepository;

public class TheatreServiceImpl implements TheatreService {

	TheatreRepository repo;

	public TheatreServiceImpl(TheatreRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(TheatreDTO dto) throws InvalidDataException {

		System.out.println("Running validateAndSave method ");

		String id = dto.getId();
		String name = dto.getName();
		String brand = dto.getBrand();
		int seats = dto.getSeats();

		boolean validId = false;
		boolean validName = false;
		boolean validBrand = false;
		boolean validSeats = false;

		if (id != null && id.length() >= 4 && id.length() <= 20) {
			System.out.println("valid id can be saved : " + id);
			validId = true;
		} else {
			System.err.println("invalid id : " + id);
		}

		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("valid name can be saved : " + name);
			validName = true;
		} else {
			System.err.println("invalid name : " + name);
		}

		if (brand != null && brand.length() >= 4 && brand.length() <= 20) {
			System.out.println("valid brand can be saved : " + brand);
			validBrand = true;
		} else {
			System.err.println("invalid brand : " + brand);
		}

		if (seats >= 20 && seats <= 500) {
			System.out.println("valid seats can be saved : " + seats);
			validSeats = true;
		} else {
			System.err.println("invalid seats : " + seats);
		}

		if (validBrand && validId && validName && validSeats) {
			System.out.println("all data are valid can be saved ");
			boolean saved=repo.save(dto);
			System.out.println("is saved successfully : "+saved);
			return true;
		}
		else
		{
			throw new InvalidDataException("data is invalid go and change data");
		}
	}

}
