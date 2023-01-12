package com.xworkz.autowired.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.xworkz.autowired")
public class SpringConfiguration {
	@Bean
	public String eName() {
		return "twoCylinderEngine";
	}
	@Bean
	public String eType() {
		return "pushroad";
	}
	@Bean
	public int number() {
		Integer it=new Integer(10338);
		return it;
	}

	@Bean
	public int eVersion() {
		return 2020;
	}
	@Bean
	public String eCompany() {
		return "piaggio";
	}
	@Bean
	public int eStrokes() {
		return 2;
	}
	@Bean
	public String name() {
		return "anconda";
	}
	@Bean
	public String color() {
		return "brown";
	}
	@Bean
	public String sType() {
		return "poisonous";
	}
	@Bean
	public double sLength() {
		return 10.5D;
	}

	@Bean
	public boolean poisonous() {
		return false;
	}

	@Bean
	public int newsId() {
		return 366;
	}

	@Bean
	public String paperName() {
		return "the hindu";
	}

	@Bean
	public String ownerName() {
		return"N.ram";
	}

	@Bean
	public String lang() {
		return "english";
	}

	@Bean
	public double paperPrice() {
		return 15.5D;
	}

	@Bean
	public String ghostName() {
		return"mohini";
	}

	@Bean
	public String ghostGender() {
		return "female";
	}

	@Bean
	public String dressColor() {
		return "white";
	}

	@Bean
	public double nailLength() {
		return 8.5D;
	}

	@Bean
	public String ghostType() {
		return "walking";
	}

	@Bean
	public boolean flying() {
		return false;
	}

	@Bean
	public LocalDate dateOfDeath() {
		return LocalDate.of(1990, 04, 8);
	}

	@Bean
	public String location() {
		return "gujarat";
	}

	@Bean
	public int nOfGhosts() {
		return 2;
	}

	@Bean
	public int age() {
		return 99;
	}

	@Bean
	public boolean grandGhostPresent() {
		return true;
	}

	@Bean
	public String gName() {
		return "vivo";
	}

	@Bean
	public String gType() {
		return "flying";
	}

	@Bean
	public String language() {
		return "bhojpuri";
	}

	@Bean
	public boolean walking() {
		return true;
	}

	@Bean
	public LocalDate gdateOfDeath() {
		return LocalDate.of(1890, 06, 11);
	}

	@Bean
	public String deathLocation() {
		return "uttarpradesh";
	}

	@Bean
	public double hairLength() {
		return 4.5;
	}

	@Bean
	public String gGender() {
		return "male";
	}

	@Bean
	public boolean ghostVisible() {
		return false;
	}


}
