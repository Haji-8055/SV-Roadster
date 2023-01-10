package com.xworkz.stream.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.stream.constant.DataBaseType;
import com.xworkz.stream.dto.DataBaseVendorDTO;

public class DataBaseRunner {

	public static void main(String[] args) {

		DataBaseVendorDTO dto1 = new DataBaseVendorDTO("Oracle", "LarryEllison", DataBaseType.ORACLERDBMS, 00, 150000);
		DataBaseVendorDTO dto2 = new DataBaseVendorDTO("MySQL", "oracle", DataBaseType.MICROSOFTSQLSERVER, 100, 12000);
		DataBaseVendorDTO dto3 = new DataBaseVendorDTO("TeraData", "TeraDataCorporation", DataBaseType.ORACLERDBMS, 100, 0);
		
		Collection<DataBaseVendorDTO> collection=Stream.of(dto1,dto2,dto3).collect(Collectors.toList());
		
		System.out.println("=========printing developed by in capital=================");
		collection.stream().forEach(dto->System.out.println(dto));
		System.out.println();
		
		
		System.out.println("=========printing dto license cost less than 100 and type is sql=================");
		collection.stream().filter(dto->dto.getLicenseCost()>100 || dto.getName().contains("SQL")).forEach(dto->System.out.println(dto));
		System.out.println();
		
		System.out.println("=========printing all DataBaseVendorDTO types =================");
		collection.forEach(dto->System.out.println(dto.getType()));
		System.out.println();

		

	}

}
