package com.xworkz.ipl.repository;

import java.time.LocalDate;

import com.xworkz.ipl.dto.WarDTO;

public interface WarRepository {

	boolean create(WarDTO dto);

	default WarDTO findByStartedBy(String startedBy) {
		return null;

	}

	default WarDTO findByStartedByAndStartedWith(String startedBy, String startedWith) {
		return null;

	}
	
	

	default WarDTO findByStartedGreaterThanOrEqualTo(LocalDate date) {
		return null;

	}

	default WarDTO findByStartedLessThanOrEqualTo(LocalDate date) {
		return null;

	}

	default WarDTO findByStartDateAndEndDate(LocalDate start, LocalDate end) {
		return null;

	}

	default int total() {
		return 0;

	}

}
