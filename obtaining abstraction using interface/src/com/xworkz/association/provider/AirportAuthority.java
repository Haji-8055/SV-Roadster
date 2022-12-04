package com.xworkz.association.provider;

import com.xworkz.association.rules.AirportRules;

public class AirportAuthority {

	private AirportRules airportRules;

	public AirportAuthority(AirportRules airportRules) {
		this.airportRules = airportRules;

	}

	public void isStaffFollowing() {
		if (airportRules != null) {

			boolean ref = airportRules.isSmoking();
			if (ref == false) {
				System.out.println("staff is following rules");
			} else
				System.out.println("staff is not following rules");

		}

	}

}
