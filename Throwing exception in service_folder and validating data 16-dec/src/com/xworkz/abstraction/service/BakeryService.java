package com.xworkz.abstraction.service;

import com.xworkz.abstraction.dto.BakeryDTO;
import com.xworkz.abstraction.exception.InvalidDataException;

public interface BakeryService {
	
	boolean validateAndSave(BakeryDTO dto) throws InvalidDataException;

}
