package com.app.org;

public class Mgr extends Emp{
	private double performanceBonus;
	public Mgr(String n,String dID,double S,double performanceBonus)
	{
		super(n,dID,S);
		this.performanceBonus=performanceBonus;
	
	}
	public String toString()
	{
		return super.toString()+"Performance Bonus is : "+performanceBonus;
	}
	public double getPerformanceBonus()
	{
		return performanceBonus;
	}

}
