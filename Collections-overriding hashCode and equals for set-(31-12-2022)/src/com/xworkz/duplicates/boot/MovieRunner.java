package com.xworkz.duplicates.boot;

import java.util.LinkedHashSet;
import java.util.Set;

import com.xworkz.duplicates.dto.MovieDTO;

public class MovieRunner {

	public static void main(String[] args) {
		
		MovieDTO dto=new MovieDTO("kgf", "kannada", 0);
		MovieDTO dto1=new MovieDTO("kgf", "kannada", 0);
		MovieDTO dto2=new MovieDTO("kgf", "kannada", 0);
		
		Set<MovieDTO> set=new LinkedHashSet<MovieDTO>(); 
		set.add(dto);
		set.add(dto1);
		set.add(dto2);
		
		System.out.println(set.size());//if we override hashcode and return one number set will not allow duplicates,,or else it will still allow duplicates 
		System.out.println(set);
		


	}
}
