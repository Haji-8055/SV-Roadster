package com.xworkz.association.follower;

import com.xworkz.association.rules.AirportRules;

public class Staff implements AirportRules {

	@Override
	public boolean isSmoking() {
		return false;
	}

}
