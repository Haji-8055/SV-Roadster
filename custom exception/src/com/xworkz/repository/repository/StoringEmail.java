package com.xworkz.repository.repository;

import com.xworkz.repository.exception.ArraySizeExceededCantStoreMoreEmails;

public class StoringEmail implements Email {

	String[] emails = new String[10];
	int index = 0;

	@Override
	public void storeEmail(String email) {
		this.emails[index] = email;
		index++;
		if(index>=emails.length) {
			throw new ArraySizeExceededCantStoreMoreEmails();
			
		}

	}

}
