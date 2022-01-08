package com.customerManagement.app;

import java.text.SimpleDateFormat;
import java.util.Date;
import enums_pack.CustomerType;
public class Customer implements Comparable<Customer> {
	private String name;
	private String email;
	private String password;
	private double registrationAmount;
	private Date dob;
	
	private  CustomerType type;
	private AadharNo adharNo;
	public static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}
	
	
	public CustomerType getType() {
		return type;
	}

	public void setType(CustomerType type) {
		this.type = type;
	}

	public Customer(String name, String email, String password, double registrationAmount, Date dob,
			CustomerType type) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.type = type;
	}
	
	public Customer(String newEmail) {
		super();
		this.email=newEmail;
	}


	@Override
	public String toString() {
		String mesg=adharNo==null?" ":adharNo.toString();
		return "Customer [name=" + name + ", email=" + email + ", password=" + password + ", registrationAmount="
				+ registrationAmount + ", dob=" + sdf.format(dob) + ", type=" + type + ",Aadhar details ="+mesg+"]";
	}
	
	
	@Override
	public boolean equals(Object o) {
		System.out.println("In Customer's equal");
		if(o instanceof Customer) {
			if((this.email).indexOf(((Customer) o).email)==0) {
				System.out.println("same email");
				return true;
			}
			return false;
		}else {
			return false;
		}
		
	}
	
	//getter and setter method 
	public Date getDob() {
		return dob;
	}



	public String getEmail(){
		return this.email;
	}
	
	public String getPassword(){
		return this.password;
	}
	
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}
	
	//assignadhar linking
	public void assignAdharno(long adharNO, String location) {
		this.adharNo=new AadharNo(adharNO, location);
	}
	
	public AadharNo getAdhar() {
		return this.adharNo;
	}
	
	//nested class
	public class AadharNo{
		private long adharNo;
		private String location;

		public AadharNo(long adharNo, String location) {
			super();
			this.adharNo = adharNo;
			this.location=location;
		}

		@Override
		public String toString() {
			return "AadharLinking [adharNo=" + adharNo +" location ="+location+"]";
		}
		
		
		
		
	}

	@Override
	public int compareTo(Customer anotherCustomer) {
		System.out.println("in Customer's compareTo");
		return email.compareTo(anotherCustomer.email);
		
	}
	
	
	
	
	
	
}
