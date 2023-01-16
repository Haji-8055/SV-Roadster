package com.xworkz.assoc.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.assoc.configuration.Configure;
import com.xworkz.assoc.rules.Browser;

public class Runner {

	public static void main(String[] args) {


		ApplicationContext spring=new AnnotationConfigApplicationContext(Configure.class);
		Browser browser1=spring.getBean("fireFox",Browser.class);
		Browser browser2=spring.getBean("chrome",Browser.class);

		browser2.browse();
		browser1.browse();
	}

}
