package com.xworkz.repository.repository;

import com.xworkz.repository.exception.CannotDolengthOperationToNull;

public class PanCard implements PanDetails {

	@Override
	public void setName(String name) {

		if (name == null) {
			throw new CannotDolengthOperationToNull();
		} else {
			System.out.println("entered name : " + name);
			System.out.println("length is : " + name.length());

		}

	}

}
