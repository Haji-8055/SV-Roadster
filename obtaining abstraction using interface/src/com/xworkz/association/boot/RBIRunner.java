package com.xworkz.association.boot;

import com.xworkz.association.follower.CanaraBank;
import com.xworkz.association.provider.RBI;
import com.xworkz.association.rules.BankRule;

public class RBIRunner {

	public static void main(String[] args) {


		BankRule bankRule=new CanaraBank();
		
		RBI rbi=new RBI(bankRule);
		
		rbi.balanceCheck();
	}

}
