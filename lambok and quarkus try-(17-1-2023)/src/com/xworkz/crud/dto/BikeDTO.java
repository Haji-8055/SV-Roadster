package com.xworkz.crud.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class BikeDTO extends AbstractAuditDTO {

	@NonNull
	@NotBlank
	@NotNull
	@Size(min = 4, max = 20, message = "bike name should be greater than 4 and less than 20")
	private String name;
	@NotBlank
	@NotNull
	@Size(min = 4, max = 20, message = "bike brand should be greater than 4 and less than 20")
	private String brand;
	@Min(value = 50, message = "bike cc should be greater than 50 and less than 1400")
	@Max(value = 1400, message = "bike cc should be greater than 50 and less than 1400")
	private int cc;
	@Min(value = 15000, message = "bike price should be greater than 15000 and less than 7000000")
	@Max(value = 7000000, message = "bike price should be greater than 15000 and less than 7000000")
	private int price;

}
