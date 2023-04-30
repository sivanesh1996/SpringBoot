package com.payilagam.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Contacts {
	
	@Id
	private String name;
	private long mobile;
	
	
	@Override
	public String toString() {
		return  "Contacts [name=" + name + ", mobile=" + mobile + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

}
