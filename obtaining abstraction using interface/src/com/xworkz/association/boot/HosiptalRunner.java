package com.xworkz.association.boot;

import com.xworkz.association.follower.Doctor;
import com.xworkz.association.provider.HosiptalManagement;
import com.xworkz.association.rules.HospitalRules;

public class HosiptalRunner {

	public static void main(String[] args) {
		
		HospitalRules ref=new Doctor();
		
		HosiptalManagement hos=new HosiptalManagement(ref);
		
		hos.doctorsVisit();
	}

}
