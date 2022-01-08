package com.app.geometry;

public class Point2D {

	private double x,y;
	public  Point2D(double x , double y) {
		this.x=x;
		this.y=y;
	}
	public String getDetails(){
		return "x Co-ordinate is : "+x+" Y Co-rdinate is : "+y;
	}
	public boolean isEqual(Point2D newp)
	{
		if(x==newp.x && y==newp.y)
			return true;
		else
			return false;
	}
	public double calculateDistance(Point2D newp)
	{
	
		return Math.sqrt(Math.pow((newp.x-x),2)+Math.pow((newp.y-y),2));
	}
	

}
