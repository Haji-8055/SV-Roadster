package com.xworkz.save.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

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
public class SoldierDTO extends AbstractAuditDTO {

	@NotBlank
	@NotNull
	@Size(min = 3, max = 30, message = "name should be greater than 3 and less than 30...")
	private String name;

	@NotBlank
	@NotNull
	@Size(min = 3, max = 30, message = "country should be greater than 3 and less than 30...")
	private String country;

	@NotBlank
	@NotNull
	@Size(min = 3, max = 30, message = "designation should be greater than 3 and less than 30...")
	private String designation;

	@NotNull
	@Min(value = 18, message = "age should be less than 60 and greater than 18...")
	private int age;

}
