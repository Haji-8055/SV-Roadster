package com.xworkz.association.provider;

import com.xworkz.association.rules.HospitalRules;

public class HosiptalManagement {

	private HospitalRules hosRule;

	public HosiptalManagement(HospitalRules hosRule) {

		this.hosRule = hosRule;
	}

	public void doctorsVisit() {
		if (hosRule != null) {

			int ref = hosRule.checkingPatients();
			if (ref >=10) {
				System.out.println(" doctor is following hospital rule");
			} else {
				System.out.println(" doctor is not following hospital rule");
			}

		}

	}
}
