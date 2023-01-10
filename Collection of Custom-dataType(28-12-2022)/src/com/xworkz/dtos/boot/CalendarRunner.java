package com.xworkz.dtos.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.dtos.dto.CalendarDTO;

public class CalendarRunner {

public static void main(String[] args) {
		
		CalendarDTO days1=new CalendarDTO("worldCalendar", 12, 2022);
		CalendarDTO days2=new CalendarDTO("hinduCalendar", 13, 2022);
		CalendarDTO days3=new CalendarDTO("persianCalendar", 12, 2022);
		CalendarDTO days4=new CalendarDTO("japaneseCalendar", 12, 2022);
		CalendarDTO days5=new CalendarDTO("persianCalendar", 12, 2022);
		CalendarDTO days6=new CalendarDTO("lunarCalendar", 13, 2022);
		
		Collection<CalendarDTO> collect=new ArrayList<CalendarDTO>();
		
		collect.add(days1);
		collect.add(days2);
		collect.add(days3);
		collect.add(days4);
		collect.add(days5);
		
		System.out.println(collect.contains(days6));

	}

}
