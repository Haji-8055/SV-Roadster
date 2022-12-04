package com.xworkz.association.provider;

import com.xworkz.association.rules.LibraryRules;

public class Librarian {

	private LibraryRules libraryRules;
	
	

	public Librarian(LibraryRules libraryRules) {
		super();
		this.libraryRules = libraryRules;
	}



	public void isSilence() {
		if (libraryRules != null) {
			boolean ref = libraryRules.keepSilence();

			if (ref == true) {
				System.out.println("readers are silent and following library rules");
			} else
				System.out.println("readers are not following library rules ");

		}
	}

}
