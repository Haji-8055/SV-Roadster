package com.xworkz.ipl.repository;

import java.time.LocalDate;

import com.xworkz.ipl.dto.WarDTO;
import com.xworkz.ipl.exception.ArraySizeExceededException;

public class WarRepositoryImplementor implements WarRepository {

	WarDTO[] warDtos = new WarDTO[10];
	int index = 0;

	@Override
	public boolean create(WarDTO dto) {

		System.out.println("Running create method of IplDTo");

		if (this.index >= this.warDtos.length) {
			throw new ArraySizeExceededException();
		}

		this.warDtos[this.index] = dto;
		System.out.println("values saved at " + this.index + "th index are " + dto);// internally --dto.toString()

		index++;
		return true;
	}

	@Override
	public WarDTO findByStartedBy(String startedBy) {
		System.out.println("running  findByStartedBy method  using-->" + startedBy);

		for (WarDTO dto : warDtos) {
			if (dto != null) {
				String starter = dto.getStartedBy();

				if (starter.equalsIgnoreCase(startedBy)) {
					System.out.println("match found " + starter);
					return dto;
				}
			}
		}

		System.out.println("no Dto is matched");
		return WarRepository.super.findByStartedBy(startedBy);
	}

	@Override
	public WarDTO findByStartedByAndStartedWith(String startedBy, String startedWith) {

		System.out.println("running findByStartedByAndStartedWith method,, StartedBy -->" + startedBy
				+ " AndStartedWith -->" + startedWith);

		for (WarDTO dto : warDtos) {
			if (dto != null) {
				String starter = dto.getStartedBy();
				String with = dto.getStartedWith();

				if (starter.equalsIgnoreCase(startedBy) && with.equalsIgnoreCase(startedWith)) {
					System.out.println("matchfound  StartedBy -->" + starter + " AndStartedWith -->" + with);
					return dto;
				}
			}
		}

		System.out.println("no Dto is matched");

		return WarRepository.super.findByStartedByAndStartedWith(startedBy, startedWith);
	}
	

	@Override
	public WarDTO findByStartedGreaterThanOrEqualTo(LocalDate date) {

		return WarRepository.super.findByStartedGreaterThanOrEqualTo(date);
	}

	@Override
	public WarDTO findByStartedLessThanOrEqualTo(LocalDate date) {

		return WarRepository.super.findByStartedLessThanOrEqualTo(date);
	}

	@Override
	public WarDTO findByStartDateAndEndDate(LocalDate start, LocalDate end) {

		return WarRepository.super.findByStartDateAndEndDate(start, end);
	}

	@Override
	public int total() {
		return this.index;
	}

}
