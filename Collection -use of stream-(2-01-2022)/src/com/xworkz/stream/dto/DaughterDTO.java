package com.xworkz.stream.dto;

import java.io.Serializable;

public class DaughterDTO implements Serializable {

	private String name;
	private long mobileNo;
	private int age;
	private boolean commited;
	private boolean alive;

	public DaughterDTO() {

	}

	public DaughterDTO(String name, long mobileNo, int age, boolean commited, boolean alive) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.age = age;
		this.commited = commited;
		this.alive = alive;
	}

	@Override
	public String toString() {
		return "DaughterDTO [name=" + name + ", mobileNo=" + mobileNo + ", age=" + age + ", commited=" + commited
				+ ", alive=" + alive + "]";
	}

	@Override
	public int hashCode() {
		return 30;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof DaughterDTO) {
				DaughterDTO dto = (DaughterDTO) obj;
				if (dto.getName().equalsIgnoreCase(name) && dto.getMobileNo() == mobileNo) {
					return true;
				}
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isCommited() {
		return commited;
	}

	public void setCommited(boolean commited) {
		this.commited = commited;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

}
