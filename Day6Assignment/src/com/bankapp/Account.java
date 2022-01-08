package com.bankapp;

public class Account {
	
	static int area(int x,int y)
	{
		return x*y;
	}
	static double area(Double x)
	{
		return x+x;
		
	}
	static int area(int x) {
		return x;
	}
	public static void main (String args[])
	{
		
		
		System.out.println(area(2.5));
		System.out.println(area(3,4));
		
		System.out.println(area(4));
	}
	

}
