package com.xworkz.association.boot;

import com.xworkz.association.follower.MetroPassenger;
import com.xworkz.association.provider.BMRCL;
import com.xworkz.association.rules.MetroRules;

public class BMRCLRunner {

	public static void main(String[] args) {

		MetroRules metroRules = new MetroPassenger();
		
		BMRCL bmrcl=new BMRCL(metroRules);
		bmrcl.checkingDistance();
	}

}
