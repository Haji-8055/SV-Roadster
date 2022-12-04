package com.xworkz.association.follower;

import com.xworkz.association.rules.BankRule;

public class CanaraBank implements BankRule {

	@Override
	public double minBalance() {

		System.out.println("Running minBalance method from CanaraBank class which is implemented.");

		return 2;
	}

}
