package com.xworkz.qualifier.configuration;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.qualifier")
public class Configure {

	@Bean
	public int id() {

		return 46;
	}

	@Bean
	public String name() {
		return "witrus";
	}

	@Bean
	public String gstNo() {
		return "29kahdg466552";
	}

	@Bean
	public String owner() {
		return "Moeen";
	}

	@Bean
	public String address() {
		return "andhrahalli";
	}

	// software..............
	@Bean
	public String name1() {
		return "java";
	}

	@Bean
	public double version() {
		return 1.8;
	}

	@Bean
	public String developer() {
		return "jamesGosling";
	}

	@Bean
	public LocalDateTime date() {
		return LocalDateTime.now();
	}

	@Bean
	public boolean isFree() {
		return true;
	}

	// softwareEngineer...................
	@Bean
	public String erName() {
		return "Haji";
	}

	@Bean
	public int salary() {
		return 32000;
	}

	@Bean
	public String companyName() {
		return "Haji's software soln";
	}

	@Bean
	public double experience() {
		return 0.6;
	}

	// pencil..............................

	@Bean
	public String pencilName() {
		return "doms";
	}

	@Bean
	public String pencilType() {
		return "wood";
	}

	@Bean
	public String pencilColor() {
		return "black";
	}

	@Bean
	public int pencilPrice() {
		return 6;
	}

	@Bean
	public boolean isSharp() {
		return false;
	}

	@Bean
	public boolean isStolen() {
		return true;
	}

	// Rubber...........................

	@Bean
	public String rubberName() {
		return "doms";
	}

	@Bean
	public String rubberType() {
		return "eraser";
	}

	@Bean
	public String rubberColor() {
		return "red";
	}

	@Bean
	public String rubberShape() {
		return "round";
	}

	@Bean
	public String rubberSize() {
		return "large";
	}

	@Bean
	public int rubberPrice() {
		return 10;
	}

	@Bean
	public boolean isRubberStolen() {
		return false;
	}

	// bike.............................
	@Bean
	public String bikeName() {
		return "kawasaki ZX 10R";
	}

	@Bean
	public byte wheels() {
		return 2;
	}

	@Bean
	public short cc() {
		return 1000;
	}

	@Bean
	public int maxSpeed() {
		return 299;
	}

	@Bean
	public long odo() {
		return 49999;
	}

	@Bean
	public float height() {
		return 3.5f;
	}

	@Bean
	public double weight() {
		return 180.5;
	}

	@Bean
	public char comfortClass() {
		return 'c';
	}

	@Bean
	public boolean isFast() {
		return true;
	}

}
