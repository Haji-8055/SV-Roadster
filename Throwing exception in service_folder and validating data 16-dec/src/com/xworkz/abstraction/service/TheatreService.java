package com.xworkz.abstraction.service;

import com.xworkz.abstraction.dto.TheatreDTO;
import com.xworkz.abstraction.exception.InvalidDataException;

public interface TheatreService {
	
	boolean validateAndSave(TheatreDTO dto) throws InvalidDataException;

}
