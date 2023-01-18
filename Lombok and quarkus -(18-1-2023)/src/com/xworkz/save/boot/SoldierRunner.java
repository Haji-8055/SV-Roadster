package com.xworkz.save.boot;

import com.xworkz.save.dto.SoldierDTO;
import com.xworkz.save.repository.SoldierRepository;
import com.xworkz.save.repository.SoldierRepositoryImpl;
import com.xworkz.save.service.SoldierService;
import com.xworkz.save.service.SoldierServiceImpl;

public class SoldierRunner {

	public static void main(String[] args) {

		SoldierDTO dto = new SoldierDTO("Murtuza", "india", "soldier", 21);

		SoldierRepository repo = new SoldierRepositoryImpl();

		SoldierService service = new SoldierServiceImpl(repo);

		service.validateAndSave(dto);
		
	}

}
