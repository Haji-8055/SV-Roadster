package com.xworkz.di.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.di.component.Shell;
import com.xworkz.di.configuration.CrudeConfiguration;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(CrudeConfiguration.class);

		System.out.println(Arrays.toString(spring.getBeanDefinitionNames()));
		Shell shell = spring.getBean(Shell.class);
		shell.purchase();
	}

}
