package enums_pack;

public enum CustomerType {
	SILVER(500),GOLD(1000),DIAMOND(1500),PLATINUM(2000);
	//adding registration amount
	private double planCost;
	
	
	//constructor for linking registration amount
	CustomerType(double planCost) {
		this.planCost=planCost;
	}
	
	//getter for registration amount
	
	public double getRegistrationAmount() {
		return planCost;
	}
	
	
	//setter for registration amount
	public void setRegistrationAmount(double planCost) {
		this.planCost=planCost;
	}
	
	// toString override
	@Override
	public String toString() {
		return name();
	}
	
	
	
	
	
	
	
}
