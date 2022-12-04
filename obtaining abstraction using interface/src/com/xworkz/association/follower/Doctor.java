package com.xworkz.association.follower;

import com.xworkz.association.rules.HospitalRules;

public class Doctor implements HospitalRules{

	@Override
	public int checkingPatients() {

		return 8;
	}

}
