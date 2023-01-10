package com.xworkz.sorted.boot;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.sorted.dto.CompanyCEODTO;

public class CompanyRunner {

	public static void main(String[] args) {

		CompanyCEODTO ceoDto1 = new CompanyCEODTO("Omkar", "US bank", 28, "india", "BCA", true);
		CompanyCEODTO ceoDto2 = new CompanyCEODTO("ferruccio", "Lamborghini", 67, "france", "BE", true);
		CompanyCEODTO ceoDto3 = new CompanyCEODTO("Enzo", "Ferrari", 25, "italy", "BE", true);
		CompanyCEODTO ceoDto4 = new CompanyCEODTO("Arshad", "humaim", 36, "india", "BE", true);
		CompanyCEODTO ceoDto5 = new CompanyCEODTO("A", "humaim", 39, "india", "BE", true);
		CompanyCEODTO ceoDto6 = new CompanyCEODTO("B", "humaim", 45, "india", "BE", true);

		Collection<CompanyCEODTO> collection = Stream.of(ceoDto3, ceoDto1, ceoDto4, ceoDto2, ceoDto6, ceoDto5)
				.collect(Collectors.toList());

		System.out.println("===========printing dto's based on insertion order============");
		collection.forEach(d -> System.out.println(d));
		System.out.println();

		System.out.println("===========printing sorted dto's by using sorted method of stream class ,"
				+ "which implicitly uses compareTo method of comparable interface============");
		collection.stream().sorted().forEach(d -> System.out.println(d));
		System.out.println();

//		Comparator<CompanyCEODTO> compa=new Comparator<CompanyCEODTO>() {
//			
//			@Override
//			public int compare(CompanyCEODTO o1, CompanyCEODTO o2) {
//				// TODO Auto-generated method stub
//				return 0;
//			} implementing above compare method by lambda expression

//		};

		System.out.println("===========printing sorted dto's by using sorted method of stream class ,"
				+ "sorting by name using compare method of comparator interface============");
		collection.stream().sorted((d1, d2) -> d1.getName().compareToIgnoreCase(d2.getName()))
				.forEach(d -> System.out.println(d));
		System.out.println();

		System.out.println("===========printing sorted dto's by using sorted method of stream class ,"
				+ "sorting by age using compare method of comparator interface============");
		collection.stream().sorted((d1, d2) -> Double.compare(d1.getAge(), d2.getAge()))
				.forEach(d -> System.out.println(d));
		System.out.println();

	}
}
