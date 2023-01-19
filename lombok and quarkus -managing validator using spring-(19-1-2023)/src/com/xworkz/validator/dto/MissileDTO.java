package com.xworkz.validator.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class MissileDTO extends AbstractAuditDTO {

	@NotBlank
	@NotNull
	@Size(min = 3, max = 20, message = "missile name should be greater than 3 and less than 20...")
	private String name;
	
	@NotBlank
	@NotNull
	@Size(min = 3, max = 20, message = "missile country name should be greater than 3 and less than 20...")
	private String country;
	
	@NotBlank
	@NotNull
	@Size(min = 3, max = 20, message = "missile founder name should be greater than 3 and less than 20...")
	private String founder;
	
	@NotNull
	@Min(value=1900,message = "year should be above 1900")
	@Max(value=2022,message = "year should be below 2023")
	private int year;
}
