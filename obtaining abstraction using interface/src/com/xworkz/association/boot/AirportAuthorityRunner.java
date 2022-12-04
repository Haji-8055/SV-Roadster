package com.xworkz.association.boot;

import com.xworkz.association.follower.Staff;
import com.xworkz.association.provider.AirportAuthority;
import com.xworkz.association.rules.AirportRules;

public class AirportAuthorityRunner {

	public static void main(String[] args) {


		AirportRules airportRules=new Staff();
		
		AirportAuthority airportAuthority=new  AirportAuthority(airportRules);
		
		airportAuthority.isStaffFollowing();
	}

}
