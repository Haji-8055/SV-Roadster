package com.xworkz.isahasa.boot;

import com.xworkz.isahasa.follower.VijayLakshmi;

public class VijayLakshmiRunner {

	public static void main(String[] args) {

		VijayLakshmi vijayLakshmi = new VijayLakshmi("FURQAN", 22, 8550882281L, "inamdar", "bagalkot");

		vijayLakshmi.uploadTask();
		System.out.println(System.lineSeparator());

		vijayLakshmi.completedProgram();
		System.out.println(System.lineSeparator());

		vijayLakshmi.paidTax(4500d);
		System.out.println(System.lineSeparator());

		vijayLakshmi.gst();
		System.out.println(System.lineSeparator());

		vijayLakshmi.vat();
		System.out.println(System.lineSeparator());

		vijayLakshmi.eat();
		System.out.println(System.lineSeparator());

		vijayLakshmi.sleep();
		System.out.println(System.lineSeparator());

		vijayLakshmi.training();
		System.out.println(System.lineSeparator());

		vijayLakshmi.executeProgram();
		System.out.println(System.lineSeparator());

	}

}
