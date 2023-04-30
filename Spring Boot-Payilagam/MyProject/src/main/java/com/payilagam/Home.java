package com.payilagam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Home {
	
	//POJO class
	
	private String owner;
	private int doorNo;
	@Autowired
	@Qualifier("abc")
	private InternetConnection modem;
	
	
	public Home() {
		System.out.println("Homes constructor");
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	
	public void connect()
	{
		modem.switchOn();
		System.out.println("connecting to internet");
	}

}
