package com.app.org;

public class Worker extends Emp{
	private double hourswork;
	private double hourlyRate;
	public Worker(String n,String dID,double S,double h,double hr)
	{
		super(n,dID,S);
		hourlyRate=hr;
		hourswork=h;
	}
	
	public String toString()
	{
		return super.toString()+"Hours Worked"+hourswork+" HourlyRate:"+hourlyRate;
	}
	public double gethourlyrate()
	
	{
		return hourswork;
	}

}
