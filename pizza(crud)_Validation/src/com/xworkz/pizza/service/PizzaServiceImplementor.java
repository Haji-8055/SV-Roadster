package com.xworkz.pizza.service;

import com.xworkz.pizza.constant.PizzaSize;
import com.xworkz.pizza.dto.PizzaDTO;

public class PizzaServiceImplementor implements PizzaService {

	@Override
	public boolean validAndSave(PizzaDTO dto) {

		String name = dto.getName();
		String company = dto.getCompany();
		PizzaSize size = dto.getSize();
		double price = dto.getPrice();
		String flavour = dto.getFlavour();
		String type = dto.getType();

		boolean validName = false;
		boolean validCompany = false;
		boolean validSize = false;
		boolean validPrice = false;
		boolean validFlavour = false;
		boolean validType = false;

		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("name is valid : " + name);
			validName = true;

		} else {
			System.err.println("name is invalid : " + name);

		}

		if (company != null && company.length() >= 4 && company.length() <= 20) {
			System.out.println("company is valid : " + company);
			validCompany = true;

		} else {
			System.err.println("company is invalid : " + company);

		}

		if (size != null) {
			System.out.println("size is valid : " + size);
			validSize = true;

		} else {
			System.err.println("size is invalid : " + size);

		}

		if (price >= 50 && price <= 2000) {
			System.out.println("price is valid : " + price);
			validPrice = true;

		} else {
			System.err.println("price is invalid : " + price);

		}

		if (flavour != null && flavour.length() >= 3 && flavour.length() <= 20) {
			System.out.println("flavour is valid : " + flavour);
			validFlavour = true;

		} else {
			System.err.println("flavour is invalid : " + flavour);

		}

		if (type != null && type.equalsIgnoreCase("veg") || type.equalsIgnoreCase("non-veg")) {
			System.out.println("type is valid : " + type);
			validType = true;

		} else {
			System.err.println("type is invalid : " + type);
		}

		if (validCompany && validFlavour && validName && validPrice && validSize && validType) {
			System.out.println("dto is valid : " + dto);
		} else {
			System.err.println("dto is invalid : " + dto);
			return false;
		}

		return true;

	}

}
