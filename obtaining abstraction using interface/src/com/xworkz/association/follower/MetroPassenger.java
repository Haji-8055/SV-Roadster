package com.xworkz.association.follower;

import com.xworkz.association.rules.MetroRules;

public class MetroPassenger implements MetroRules {

	@Override
	public int PaltformEdgeLimit() {
		return 2;
	}

}
