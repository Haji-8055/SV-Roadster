package com.xworkz.association.boot;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.association.component.Battery;
import com.xworkz.association.component.Camera;
import com.xworkz.association.component.CameraMan;
import com.xworkz.association.component.Director;
import com.xworkz.association.component.Lens;
import com.xworkz.association.configuration.Configure;

public class Runner {

	public static void main(String[] args) {

	
		ApplicationContext spring=new AnnotationConfigApplicationContext(Configure.class);
		
		Director director=spring.getBean(Director.class);
		System.out.println(".......director has a experience and skill...");

		director.getExperience();
		director.getSkill();
		
		director.display();
		
		CameraMan cameraMan=spring.getBean(CameraMan.class);
		cameraMan.cameraManDisplay();
		
		Camera camera=cameraMan.getCamera();
		System.out.println(".......CameraMan has a camera");
		camera.display();
		
		Lens lens=camera.getLens();
		Battery battery=camera.getBattery();
		System.out.println("........Camera has a battery and a lens");

		battery.dis();
		System.out.println(".......battery has a capacity");

		
	}

}
