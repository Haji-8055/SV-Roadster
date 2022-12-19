package com.xworkz.pizza.boot;

import java.time.LocalDateTime;

import com.xworkz.pizza.constant.PizzaSize;
import com.xworkz.pizza.dto.PizzaDTO;
import com.xworkz.pizza.service.PizzaService;
import com.xworkz.pizza.service.PizzaServiceImplementor;

public class PizzaRunner {

	public static void main(String[] args) {

		PizzaDTO dto = new PizzaDTO("System", LocalDateTime.now(), null, null, "Cheese pizza", "dominos",
				PizzaSize.MEDIUM, true, 120, "spicy", "veg");

		PizzaService pizzaService = new PizzaServiceImplementor();
		System.out.println(pizzaService.validateAndSave(dto));

		System.out.println("====passing another dto with invalid data====");

		PizzaDTO dto1 = new PizzaDTO("System", LocalDateTime.now(), null, null, "Cheese pizza", "dominos",
				PizzaSize.MEDIUM, true, 10, "spicy", "veg");
		System.out.println(pizzaService.validateAndSave(dto1));
		
		
		/*boolean validation=pizzaService.validAndSave(dto);
		if(validation) {
			System.out.println("dto is valid : "+dto);
		}else
		{
			System.out.println("dto is invalid : "+dto);
		}*/


	}

}
