package com.app.fruites;

public class Mango extends Fruite{

	public Mango(String n, String c, double w, boolean f) {
		super(n, c, w, f);
		
	}
	public String taste()
	{
		return "Sweet";
	}
	public void pulp() {
		System.out.println("Name: "+getName()+" Color: "+getColor());
		System.out.println("Creating Pulp");
	}
	

	
		

}
