package com.xworkz.ipl.boot;

import java.time.LocalDate;

import com.xworkz.ipl.dto.WarDTO;
import com.xworkz.ipl.repository.WarRepositoryImplementor;

public class WarRunner {

	public static void main(String[] args) {
		
		WarRepositoryImplementor warRepositoryImplementor=new WarRepositoryImplementor();

		WarDTO warDTO=new WarDTO("the indo-pak war", LocalDate.of(1965, 8, 27), LocalDate.of(1965, 9, 23), "pakistan", "india", "india", 5988);
		warRepositoryImplementor.create(warDTO);
		
		
		WarDTO warDTO1=new WarDTO("the indo-china war-1", LocalDate.of(1969, 5, 20), LocalDate.of(1969, 6, 5), "india", "china", "india", 6000);
		warRepositoryImplementor.create(warDTO1);


		
		
		
		System.out.println(warRepositoryImplementor.findByStartedBy("pakistan"));
		System.out.println(warRepositoryImplementor.findByStartedByAndStartedWith("pakistan","india"));
	}

}
