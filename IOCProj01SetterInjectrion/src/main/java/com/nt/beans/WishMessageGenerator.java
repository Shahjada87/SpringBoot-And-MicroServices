package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	
	//Has-A property (Supporting composition)
	private Date date;

	//Setter method for setter injection (Alt+shift+s, r --> select setDate() -->ok)
	public void setDate(Date date) {
		this.date = date;
	}
	
	//Business method 
	public String generateMessage(String user) {
		
		//get current hour of day and time 
		int hour = date.getHours();   //24 hrs format 
		
		//generate wish message 
		if(hour<12)
			return "Good Morning "+user;
		else if(hour<17)
			return "Good Afternoon "+user;
		else if(hour<20)
			return "Good Evening "+user;
		else
			return "Good Night "+user;
	}
	
}
