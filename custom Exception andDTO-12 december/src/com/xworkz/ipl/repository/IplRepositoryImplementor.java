package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.IplDTO;
import com.xworkz.ipl.exception.ArraySizeExceededException;

public class IplRepositoryImplementor implements IplRepository {

	private IplDTO[] iplDTOs = new IplDTO[10];
	private int index = 0;

	@Override
	public boolean create(IplDTO dto) {

		System.out.println("Running create method of IplDTo");

		if (this.index >= this.iplDTOs.length) {
			throw new ArraySizeExceededException();
		}

		this.iplDTOs[this.index] = dto;
		System.out.println("values saved at " + index + "th index are " + dto);// internally --dto.toString()

		index++;
		return true;
	}

}
  