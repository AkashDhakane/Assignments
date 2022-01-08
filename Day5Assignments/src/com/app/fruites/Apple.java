package com.app.fruites;

public class Apple extends Fruite{

	public Apple(String n, String c, double w, boolean f) {
		super(n, c, w, f);
	}
	public String taste()
	{
		return "Sweet and Sour";
	}
	
	public void jam() {
		System.out.println("Name: "+getName());
		System.out.println("Making Jam !!!!!!!!");
	}

}
