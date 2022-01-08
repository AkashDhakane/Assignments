package com.app.emp;

public class Worker extends Emp {
		private int hoursWorked;
		private double hourlyRate;
		public Worker( String name, String deptId, double basic, int hoursWorked, double hourlyRate) {
			super( name, deptId, basic);
			this.hoursWorked = hoursWorked;
			this.hourlyRate = hourlyRate;
		}
		@Override
		public String toString() {
			return "Worker"+super.toString()+""+"[hoursWorked=" + hoursWorked + ", hourlyRate=" + hourlyRate + "]";
		}
		public double netSal()
		{
			return hoursWorked*hourlyRate + getBasic();
		}
		@Override
	
		public double sal() {
			// TODO Auto-generated method stub
			return getBasic();
		}
		
		
		
		
		
}
