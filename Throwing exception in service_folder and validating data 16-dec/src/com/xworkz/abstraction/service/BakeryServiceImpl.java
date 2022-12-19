package com.xworkz.abstraction.service;

import com.xworkz.abstraction.dto.BakeryDTO;
import com.xworkz.abstraction.exception.InvalidDataException;
import com.xworkz.abstraction.repository.BakeryRepository;

public class BakeryServiceImpl implements BakeryService {
	
	BakeryRepository repo;

	public BakeryServiceImpl(BakeryRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(BakeryDTO dto) throws InvalidDataException {

		String name = dto.getName();
		String owner = dto.getOwner();
		String location = dto.getLocation();
		String famousFor = dto.getFamousFor();
		long contact = dto.getContact();

		boolean validName = false;
		boolean validOwner = false;
		boolean validLocation = false;
		boolean validFamousFor = false;
		boolean validContact = false;

		if (name != null && name.length() >= 3 && name.length() <= 20) {
			System.out.println("building name is valid can be saved : " + name);
			validName = true;
		} else {
			System.err.println("invalid name : " + name);
		}

		if (owner != null && owner.length() >= 3 && owner.length() <= 20) {
			System.out.println("building owner is valid can be saved : " + owner);
			validOwner = true;
		} else {
			System.err.println("invalid owner : " + owner);
		}

		if (location != null && location.length() >= 3 && location.length() <= 20) {
			System.out.println("building location is valid can be saved : " + location);
			validLocation = true;
		} else {
			System.err.println("invalid location : " + location);
		}

		if (famousFor != null && famousFor.length() >= 3 && famousFor.length() <= 20) {
			System.out.println("building famousFor is valid can be saved : " + famousFor);
			validFamousFor = true;
		} else {
			System.err.println("invalid famousFor : " + famousFor);
		}

		if (contact>=6666666666l  && contact <= 9999999999l) {
			System.out.println("building contact is valid can be saved : " + contact);
			validContact = true;
		} else {
			System.err.println("invalid contact : " + contact);
		}

		if (validName && validOwner && validLocation && validFamousFor && validContact) {
			System.out.println("all data are valid can be saved ");
			boolean saved = repo.save(dto);
			System.out.println("is saved successfully? : " + saved);
			return true;
		} else {
			throw new InvalidDataException("data is invalid go and change data");
		}

	}

}
