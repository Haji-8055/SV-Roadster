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
public class FirstAidDTO extends AbstractAuditDTO {
	
	@NotBlank
	@NotNull
	@Size(min = 3, max = 20, message = "place name should be greater than 3 and less than 20...")
	private String place;
	
	@NotBlank
	@NotNull
	@Size(min = 3, max = 20, message = "boxColor name should be greater than 3 and less than 20...")
	private String boxColor;
	
	@NotNull
	@Min(value=1,message = "NoOfMedicines should be above 1")
	@Max(value=20,message = "NoOfMedicines should be below 20")
	private int NoOfMedicines;

}
