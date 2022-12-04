package com.xworkz.association.provider;

import com.xworkz.association.rules.BankRule;

public class RBI {

	private BankRule bankRule;

	public RBI(BankRule bankRule) {
		this.bankRule = bankRule;

	}

	public void balanceCheck() {
		System.out.println("Running balance check method form RBI class");
		if (this.bankRule != null) {
			double balance = bankRule.minBalance();
			if (balance > 5) {
				System.out.println("CanaraBank is following RBI minBalance Rule");

			} else {
				System.out.println("CanaraBank is not maintaining minimum balance");
			}
		}
	}

}
