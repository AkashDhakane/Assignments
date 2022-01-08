package com.app.emp;

public abstract class Emp {
		private int id;
		private String name;
		private String deptId;
		private double basic;
		public static int offset;
		private static int id_generator;
		static {
			
			id_generator=100;
			offset=id_generator;
		}
		public Emp(String name, String deptId, double basic) {
			super();
			this.id = id_generator++;
			this.name = name;
			this.deptId = deptId;
			this.basic = basic;
	
		}
		public double getBasic() {
			return basic;
		}
		
		public void setBasic(double basic) {
			this.basic = basic;
		}
		@Override
		public String toString() {
			return "Emp [id=" + id + ", name=" + name + ", deptId=" + deptId + ", basic=" + basic + "]";
		}
		public abstract double sal();
		
		
}
