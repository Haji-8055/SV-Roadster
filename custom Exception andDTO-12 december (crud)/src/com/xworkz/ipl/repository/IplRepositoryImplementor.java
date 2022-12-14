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
		System.out.println("values saved at " +  this.index  + "th index are " + dto);// internally --dto.toString()

		index++;
		return true;
	}

	@Override
	public IplDTO findByCaptainName(String captainName) {
		System.out.println("Running findByCaptainName -->" + captainName);
		for (IplDTO dto : this.iplDTOs) {
			String captain = dto.getCaptainName();
			if (dto != null && captain.equalsIgnoreCase(captainName)) {
				System.out.println("Captain name matched -->" + captain);
				return dto;
			}
		}

		System.out.println("no Dto is matched");

		return IplRepository.super.findByCaptainName(captainName);
	}

}
