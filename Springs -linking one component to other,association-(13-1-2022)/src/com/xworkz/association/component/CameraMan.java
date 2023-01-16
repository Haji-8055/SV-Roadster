package com.xworkz.association.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.association.component.Camera;

@Component
public class CameraMan {
	
	@Autowired
	private Camera camera;
	
	
	public CameraMan() {
		System.out.println("created CameraMan using no-arg constructor.");
	}
	
	public void cameraManDisplay() {
		System.out.println(camera);
	}
	
	public Camera getCamera() {
		return camera;
	}
	


}
