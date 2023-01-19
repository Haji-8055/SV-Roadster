package com.xworkz.validator.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
public class ResortDTO extends AbstractAuditDTO {

	@NotBlank
	@NotNull
	@Size(min = 3, max = 20, message = "resort name should be greater than 3 and less than 20...")
	private String name;

	@NotBlank
	@NotNull
	@Size(min = 3, max = 20, message = "city name should be greater than 3 and less than 20...")
	private String city;

	@NotNull
	@Min(value = 100, message = "rent should be above 100")
	@Max(value = 50000, message = "rent should be below 50000")
	private int rent;

}
