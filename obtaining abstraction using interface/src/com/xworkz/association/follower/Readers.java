package com.xworkz.association.follower;

import com.xworkz.association.rules.LibraryRules;

public class Readers implements LibraryRules {

	@Override
	public boolean keepSilence() {

		return true;
	}

}
