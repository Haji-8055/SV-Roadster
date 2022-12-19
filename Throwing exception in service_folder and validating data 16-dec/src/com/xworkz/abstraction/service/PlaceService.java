package com.xworkz.abstraction.service;

import com.xworkz.abstraction.dto.PlaceDTO;
import com.xworkz.abstraction.exception.InvalidDataException;

public interface PlaceService {
	
	boolean validateAndSave(PlaceDTO dto) throws InvalidDataException;

}
