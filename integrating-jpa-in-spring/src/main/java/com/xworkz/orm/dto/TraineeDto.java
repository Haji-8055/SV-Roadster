package com.xworkz.orm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TraineeDto {

    private Integer id;

    @NotNull(message = "trainee name should not be empty")
    @NotEmpty(message = "trainee name should not be empty")
    @NotBlank(message = "trainee name should not be blank")
    private String traineeName;

    @NotNull(message = "CGPA should not be empty")
    @Min(value = 0,message = "enter valid cgpa")
    @Max(value = 10 ,message = "enter valid cgpa")
    private Double cgpa;
}
