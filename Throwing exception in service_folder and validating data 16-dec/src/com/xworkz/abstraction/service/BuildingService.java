package com.xworkz.abstraction.service;

import com.xworkz.abstraction.dto.BuildingDTO;
import com.xworkz.abstraction.exception.InvalidDataException;

public interface BuildingService {
	
	boolean validateAndSave(BuildingDTO dto) throws InvalidDataException;

}
