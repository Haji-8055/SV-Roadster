package com.xworkz.qualifier.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.qualifier.component.Bike;
import com.xworkz.qualifier.component.HardwareShop;
import com.xworkz.qualifier.component.Pencil;
import com.xworkz.qualifier.component.Rubber;
import com.xworkz.qualifier.component.Software;
import com.xworkz.qualifier.component.SoftwareEngineer;
import com.xworkz.qualifier.configuration.Configure;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(Configure.class);

		HardwareShop shop = container.getBean(HardwareShop.class);
		System.out.println(shop);

		Software software = container.getBean(Software.class);
		System.out.println(software);

//		SoftwareEngineer engineer=container.getBean(SoftwareEngineer.class);
//		System.out.println(engineer);

		// or
		System.out.println(container.getBean(SoftwareEngineer.class));

		System.out.println(container.getBean(Pencil.class));

		System.out.println(container.getBean(Rubber.class));

		System.out.println(container.getBean(Bike.class));
	}

}
