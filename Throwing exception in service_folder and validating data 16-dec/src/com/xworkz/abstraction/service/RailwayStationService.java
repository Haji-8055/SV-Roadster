package com.xworkz.abstraction.service;

import com.xworkz.abstraction.dto.RailwayStationDTO;
import com.xworkz.abstraction.exception.InvalidDataException;

public interface RailwayStationService {

	boolean validateAndSave(RailwayStationDTO dto) throws InvalidDataException;

}
