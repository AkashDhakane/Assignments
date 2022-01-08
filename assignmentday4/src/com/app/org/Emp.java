package com.app.org;

public class Emp {
	public  int ID;
	private String name,deptID;
	private double Sal;
	public Emp(String name,String deptID,double Sal)
	{
		this.deptID=deptID;
		this.name=name;
		this.Sal=Sal;
		ID=++ID;
	}
	public String toString()
	{
		return "EMP ID : "+ID+" Emp Name: "+name+" DeptNo: "+deptID+"Salary :"+Sal;
	}
	

}
