package car_dealership;

public class Employee {
	String name;
	String title;
	int employeeId;
	
	
	


	public Employee(String name, String title, int employeeId) {
		super();
		this.name = name;
		this.title = title;
		this.employeeId = employeeId;
	}


	public void handleCustomer(Customer cust, Cars car) {
		
		if(cust.isLeasing == true) {
			double loanAmount = car.getPrice(cust) - cust.getCashOnHand();	
			runCreditHistory(cust, loanAmount);		
		} else if (cust.isLeasing==false) {
			if(car.getPrice(cust) <= cust.getCashOnHand()) {
				processTransaction(cust, car);
			} else {
				System.out.println("Customer needs a larger cash amount. Please advise the customer.");
			}
		}
	}
	
	
	public void runCreditHistory(Customer cust, double loanAmount) {
		
		System.out.println("Ran Credit History for Customer...");
		System.out.println("Customer has been approved to purhcase vehicle.");
		
	}
	
	
	public void processTransaction(Customer cust, Cars car) {
		System.out.println("Customer is purchasing vehicle with cash, transaction assigned to "+ this.name);
		System.out.println("Total Purchase price for "+car+" $"+car.getPrice(cust));
	}

}
