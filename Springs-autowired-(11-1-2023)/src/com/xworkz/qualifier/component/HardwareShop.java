package com.xworkz.qualifier.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardwareShop {
	
	@Autowired
	private int id;
	
	@Autowired
	private String name;
	
	@Autowired
	private String gstNo;
	
	@Autowired
	@Qualifier("owner")//if there are more than one bean of same type in configure class,we need to mention bean name
	private String ownerName;
	
	@Autowired
	private String address;
	
	public HardwareShop() {
		System.out.println("default constructor of hardware shop...");

	}

	@Override
	public String toString() {
		return "HardwareShop [id=" + id + ", name=" + name + ", gstNo=" + gstNo + ", ownerName=" + ownerName
				+ ", address=" + address + "]";
	}
	
	
	
	

}
