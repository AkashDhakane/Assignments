package com.app.fruites;

public class Orange extends Fruite {

	public Orange(String n, String c, double w, boolean f) {
		super(n, c, w, f);
		
	}
	public String taste()
	{
		return "Sour";
	}
	public void juice()
	{
		System.out.println("Name: "+getName()+" Weight: "+getWeight());
		System.out.println("Extracting Juice!!!!!");
	}
	

}
