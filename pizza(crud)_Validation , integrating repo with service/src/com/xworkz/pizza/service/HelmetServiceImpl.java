package com.xworkz.pizza.service;

import com.xworkz.pizza.constant.Color;
import com.xworkz.pizza.constant.HelmetType;
import com.xworkz.pizza.dto.HelmetDTO;
import com.xworkz.pizza.repository.HelmetRepository;

public class HelmetServiceImpl implements HelmetService {

	private HelmetRepository helmetRepo;

	public HelmetServiceImpl(HelmetRepository helmetRepo) {
		super();
		this.helmetRepo = helmetRepo;
	}

	@Override
	public boolean validateAndSave(HelmetDTO dto) {

		String brand = dto.getBrand();
		HelmetType type = dto.getType();
		Color color = dto.getColor();
		double price = dto.getPrice();

		boolean validBrand = false;
		boolean validType = false;
		boolean validColor = false;
		boolean validPrice = false;

		if (brand != null && brand.length() >= 4 && brand.length() <= 10) {
			System.out.println("brand is valid : " + brand);
			validBrand = true;
		} else {
			System.err.println("brand is invalid : " + brand);
		}

		if (type != null) {
			System.out.println("type is valid : " + type);
			validType = true;
		} else {
			System.err.println("type is invalid : " + type);
		}

		if (color != null) {
			System.out.println("color is valid : " + color);
			validColor = true;
		} else {
			System.err.println("color is invalid : " + color);
		}

		if (price >= 750 && price <= 10000) {
			System.out.println("price is valid : " + price);
			validPrice = true;
		} else {
			System.err.println("price is invalid : " + price);
		}

		if (validBrand && validColor && validPrice && validType) {
			System.out.println("dto is valid can be saved : " + dto);
			boolean saved = helmetRepo.save(dto);
			System.out.println("dto saved ? : " + saved);
			return true;
		} else {
			System.err.println("dto is inavlid");
		}

		return false;
	}

}
