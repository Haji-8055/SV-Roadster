package com.xworkz.association.provider;

import com.xworkz.association.rules.MetroRules;

public class BMRCL {

	private MetroRules metroRules;

	public BMRCL(MetroRules metroRules) {
		super();
		this.metroRules = metroRules;
	}

	public void checkingDistance() {
		if (metroRules != null) {
			int ref = metroRules.PaltformEdgeLimit();
			if (ref >= 2) {
				System.out.println("passenger is keeping safe distance of 2 meters");
			} else
				System.out.println("passenger is keeping safe distance of 2 meters");

		}
	}

}
