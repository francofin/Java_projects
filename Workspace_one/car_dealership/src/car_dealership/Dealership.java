package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer("", "", 0.0, false, false, true);
		Customer cust2 = new Customer("", "", 0.0, false, false, false);
		Customer cust3 = new Customer("", "", 0.0, false, false, true);
		Customer cust4 = new Customer("", "", 0.0, false, false, true);
		Customer cust5 = new Customer("", "", 0.0, false, false, false);
		Customer cust6 = new Customer("", "", 0.0, false, false, true);
		Customer cust7 = new Customer("", "", 0.0, false, false, false);
		
		cust1.returningCustomer = true;
		cust1.setCashOnHand(15000.00);
		cust1.setHardToSell(true);
		cust1.setName("Michael Bollinger");
		cust1.setAddress("58 New Haven Road Pensylvania, PA, 88976");
		
		
		cust2.setCashOnHand(5000.00);
		cust2.setName("Tammy Michelin");
		cust2.setAddress("5 Jambaya Lane Pensylvania, PA, 88558");
		
		cust3.returningCustomer = true;
		cust3.setCashOnHand(22000.00);
		cust3.setName("Ginger Halley");
		cust3.setAddress("65 Town Lobby Drive Michigan, 88935");
		
		cust4.setCashOnHand(30000.00);
		cust4.setName("Jamari Holding");
		cust4.setAddress("1875 Biscayne Blvd Miami, Florida, 99375");
		
		cust6.returningCustomer = true;
		cust5.setCashOnHand(15000.00);
		cust5.setHardToSell(true);
		cust5.setName("Maria Robusto");
		cust5.setAddress("1875 Biscayne Blvd Miami, Florida, 99375");
		
		
		cust6.setCashOnHand(35000.00);
		cust6.setName("Jason Borne");
		cust6.setAddress("112 Lowdown Avenue Newport, Maine 11576");
		
		cust7.returningCustomer = true;
		cust7.setCashOnHand(30000.00);
		cust7.setName("Samuel Umtiti");
		cust7.setAddress("88 Avalanche Courtyard New York, New York 115784");
		
		Employee emp = new Employee("John Dillingerj", "Senior Sales Rep", 11588);
		
		Cars car1 = new Cars("Chevy", "Malibu", "Sedan", 25000.00, 212, "Black", true, (short) 2020);
		Cars car2 = new Cars("BMW", "M3", "Sedan", 250000.00, 560, "White", false, (short) 2021);
		cust7.purchaseCar(car1, emp);
		
		
		
		
		

	}

}
