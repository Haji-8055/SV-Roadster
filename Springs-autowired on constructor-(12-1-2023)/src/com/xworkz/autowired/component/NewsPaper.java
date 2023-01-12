package com.xworkz.autowired.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class NewsPaper {

	@Autowired
	@Qualifier("newsId")
	private int id;//p

	private String name;//c

	private String OwnerName;//c
	@Autowired
	@Qualifier("lang")
	private String lang;//p

	private double price;//s

	@Autowired
	public NewsPaper(@Qualifier("paperName") String name,  @Qualifier("ownerName") String ownerName) {
		this.name = name;
		OwnerName = ownerName;
	}


	

	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", OwnerName=" + OwnerName + ", lang=" + lang + ", price="
				+ price + "]";
	}




	@Autowired
	@Qualifier("paperPrice")
	public void setPrice(double price) {
		this.price = price;
	}

}
