package com.app.customer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import enums.CustomerType;

public class Customer {
	private String name;
	private String email;
	private String password;
	private double registrationAmount;
	private Date dob;
	private CustomerType type;
	private AdharCard adharCard;
	public static SimpleDateFormat sdf;
	
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}
	
	//adding constructor with all field
	public Customer(String name, String email, String password, double registrationAmount, Date dob, CustomerType type) throws ParseException {
		super();
		this.name = name;
		this.email = email.toLowerCase();
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.type = type;
	}
	
	//add constructor with email field only
	public Customer(String email) {
		super();
		this.email = email.toLowerCase();
	}
	

	//override toString method
	@Override
	public String toString() {
		return "Cutomer \nname=" + name + "\nemail=" + email + "\npassword=" + password + "\nregistrationAmount="
				+ registrationAmount + "\ndob=" + sdf.format(dob) + "\ntype=" + type +((adharCard==null)?"":this.adharCard.toString());
	}
	
	//override equals method
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Customer)
			return this.email.equals(((Customer)obj).email);
		return false;
	}

	//gettter
	public String getPassword() {
		return password;
	}
	
	//assignAdharCard
	public void assignAdharCard(String adharCardNo, String location) {
		adharCard = new AdharCard(adharCardNo,location);
	}
	
	//Inner Class : Adhar Card
	class AdharCard{
		private String adharCardNo;
		private String location;

		//Constructor
		public AdharCard(String adharCardNo, String location) {
			super();
			this.adharCardNo = adharCardNo;
			this.location = location;
		}
		
		
		@Override
		public String toString() {
			return "\nAdhar Card No=" + adharCardNo + "\nlocation=" + location;
		}
		
	}
}
