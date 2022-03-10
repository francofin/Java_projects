package car_dealership;

public class Customer {
	
	private String name;
	private String address;
	private double cashOnHand;
	boolean returningCustomer;
	private boolean hardToSell;
	boolean isLeasing;
	
	public Customer(String name, String address, double cashOnHand, boolean returningCustomer, boolean hardToSell,
			boolean isLeasing) {
		super();
		this.name = name;
		this.address = address;
		this.cashOnHand = cashOnHand;
		this.returningCustomer = returningCustomer;
		this.hardToSell = hardToSell;
		this.isLeasing = isLeasing;
	}

	public boolean isReturningCustomer() {
		return returningCustomer;
	}

	public void setReturningCustomer(boolean returningCustomer) {
		this.returningCustomer = returningCustomer;
	}

	public boolean isHardToSell() {
		return hardToSell;
	}

	public void setHardToSell(boolean hardToSell) {
		this.hardToSell = hardToSell;
	}

	public boolean isLeasing() {
		return isLeasing;
	}

	public void setLeasing(boolean isLeasing) {
		this.isLeasing = isLeasing;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCashOnHand(double cashOnHand) {
		if (this.returningCustomer) {
			this.cashOnHand = cashOnHand+5000.0;
		} else {
			this.cashOnHand = cashOnHand;
		}
		
	}

	public double getCashOnHand() {
		return cashOnHand;
	}
	
	
	public void purchaseCar(Cars car, Employee emp) {
		emp.handleCustomer(this, car);
		
	}

	

}
