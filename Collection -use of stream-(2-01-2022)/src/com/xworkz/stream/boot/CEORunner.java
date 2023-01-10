package com.xworkz.stream.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.stream.dto.CompanyCEODTO;
import com.xworkz.stream.dto.DaughterDTO;

public class CEORunner {

	public static void main(String[] args) {


		DaughterDTO dto1 = new DaughterDTO("Xyz", 8865453254L, 25, true, true);
		DaughterDTO dto2 = new DaughterDTO("abc", 6365456225L, 28, true, true);
		DaughterDTO dto3 = new DaughterDTO("Xyz", 7525456523L, 8, false, true);
		DaughterDTO dto4 = new DaughterDTO("lmn", 9856456525L, 9, false, true);

		CompanyCEODTO ceoDto1 = new CompanyCEODTO("Omkar", "US bank", 28, "india", "BCA", true, dto1);
		CompanyCEODTO ceoDto2 = new CompanyCEODTO("ferruccio", "Lamborghini", 67, "france", "BE", true, dto2);
		CompanyCEODTO ceoDto3 = new CompanyCEODTO("Enzo", "Ferrari", 25, "italy", "BE", true, dto3);
		CompanyCEODTO ceoDto4 = new CompanyCEODTO("Arshad", "humaim", 36, "india", "BE", true, dto4);

		Collection<CompanyCEODTO> collection = new ArrayList<>();
		collection.add(ceoDto1);
		collection.add(ceoDto2);
		collection.add(ceoDto3);
		collection.add(ceoDto4);

		// OR
//		 Collection<CompanyCEODTO> collection1=Stream.of(ceoDto1, ceoDto2, ceoDto3, ceoDto4).collect(Collectors.toList());
		
		System.out.println("=========================printing DaughterDTO=========================");
		collection.forEach(d->System.out.println(d.getDto()));
		
		System.out.println("=========================printing DaughterDTO names=========================");
		collection.forEach(d->System.out.println(d.getDto().getName()));
		
		
		System.out.println("=========================printing CompanyCEODTO age>30=========================");
		collection.stream().filter(dto->dto.getAge()>30).forEach(dto->System.out.println(dto));
		
		System.out.println("=========================printing CompanyCEODTO and daughter age =========================");
		collection.forEach(dto->System.out.println("Father age : "+dto.getAge()+" , Daughter age : "+dto.getDto().getAge()));
		
		

		

	}

}
