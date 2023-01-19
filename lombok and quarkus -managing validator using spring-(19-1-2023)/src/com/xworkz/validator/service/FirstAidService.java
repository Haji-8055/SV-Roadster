package com.xworkz.validator.service;

import com.xworkz.validator.dto.FirstAidDTO;

public interface FirstAidService {
	
	boolean validateAndSave(FirstAidDTO dto);

}
