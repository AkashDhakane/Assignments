package com.app.fruites;

public class Fruite {
	private String name,color;
	private double  weight;
	private boolean fresh;
	public Fruite(String n,String c,double w,boolean f){
		this.name=n;
		this.color=c;
		this.weight=w;
		
	}
	public String taste()
	{
		return "NO Specific taste";
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public double getWeight() {
		return weight;
	}
	public boolean isFresh() {
		return fresh;
	}
	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}
	
	

}
