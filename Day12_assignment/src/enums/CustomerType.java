package enums;

public enum CustomerType {
	SILVER(500),GOLD(1000),DIAMOND(1500),PLATINUM(2000);
	//state: registration amount
	private int regAmount;

	//constructor
	private CustomerType(int regAmount) {
		this.regAmount = regAmount;
	}

	//getter
	public int getRegAmount() {
		return regAmount;
	}
	
	@Override
	//toString
	public String toString() {
		return name().toLowerCase();
	}
	
}
