package com.app.emp;



public class Mgr extends Emp {
	private double performanceBonus;

	public Mgr( String name, String deptId, double basic, double performanceBonus) {
		super(name, deptId, basic);
		this.performanceBonus = performanceBonus;
	}

	@Override
	public double sal() {
		// TODO Auto-generated method stub
		return getBasic()+performanceBonus;
	}
	public double getPerformanceBonus() {
		return performanceBonus;
	}

	

	@Override
	public String toString()
	{
		return "Mgr" +super.toString()+"Bonus: "+performanceBonus;
	}
	
	
	

}
