package com.xworkz.dtos.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.dtos.dto.HolidayDTO;

public class HolidayRunner {

	public static void main(String[] args) {

		HolidayDTO celebrate1 = new HolidayDTO("national holiday", "Holi", 1832022);
		HolidayDTO celebrate2 = new HolidayDTO("national holiday", "onam", 982022);
		HolidayDTO celebrate3 = new HolidayDTO("national holiday", "eidmilad", 562022);
		HolidayDTO celebrate4 = new HolidayDTO("national holiday", "diwali", 792022);
		HolidayDTO celebrate5 = new HolidayDTO("national holiday", "christmas", 252022);
		HolidayDTO celebrate6 = new HolidayDTO("national holiday", "ugadi", 1532022);

		Collection<HolidayDTO> collect = new ArrayList<HolidayDTO>();
		collect.add(celebrate1);
		collect.add(celebrate2);
		collect.add(celebrate3);
		collect.add(celebrate4);
		collect.add(celebrate5);

		System.out.println(collect.contains(celebrate6));

	}

}
