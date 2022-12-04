package com.xworkz.association.boot;

import com.xworkz.association.follower.Readers;
import com.xworkz.association.provider.Librarian;
import com.xworkz.association.rules.LibraryRules;

public class LibrarianRunner {

	public static void main(String[] args) {


		LibraryRules libraryRules=new Readers();
		
		Librarian librarian=new Librarian(libraryRules);
		librarian.isSilence();
	}

}
