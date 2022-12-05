package com.xworkz.isahasa.follower;

import com.xworkz.isahasa.rules.KarnatakaRTO;

public class VijayLakshmi extends JavaTrainee implements KarnatakaRTO {

	public VijayLakshmi(String name, int age, long mobileNo, String surname, String city) {
		super(name, age, mobileNo, surname, city);

	}

	@Override
	public boolean paidTax(double amount) {
		System.out.println(" paidTax method from TransportRule interface ,which is inherited in KarnatakRTO interface and implemented in VijayLakshmi class ");
		System.out.println(" paid tax is "+amount);
		return false;
	}

	@Override
	public double gst() {
		System.out.println(" gst method from TransportRule interface ,which is inherited in KarnatakRTO interface and implemented in VijayLakshmi class ");

		return 0;
	}

	@Override
	public double vat() {
		System.out.println(" vat method from KarnatakRTO interface implemented in VijayLakshmi class ");
		return 0;
	}

	@Override
	public boolean uploadTask() {

		System.out.println(" uploadTask method from XwrokzRule interface ,which is implemented in javaTrainee class and overRidden in VijayLakshmi class");

		return super.uploadTask();
	}

	@Override
	public boolean completedProgram() {
		System.out.println(" completedProgram method from XwrokzRule interface ,which is implemented in javaTrainee class and overRidden in VijayLakshmi class ");


		return super.completedProgram();
	}

	@Override
	public void eat() {

		System.out.println(" eat method from person abstract class ,which is implemented in javaTrainee class and overRidden in VijayLakshmi class ");

		super.eat();
	}

	@Override
	public void sleep() {
		System.out.println(" sleep method from person abstract class ,which is implemented in javaTrainee class and overRidden in VijayLakshmi class ");

		super.sleep();
	}

	@Override
	public void training() {
		System.out.println(" training method from JavaTrainee class ,which is overRidden in VijayLakshmi class ");

		super.training();
	}
	
	@Override
	public void executeProgram() {
		System.out.println(" executeProgram method from JavaTrainee class ,which is overRidden in VijayLakshmi class ");

		super.executeProgram();
	}
	

}
