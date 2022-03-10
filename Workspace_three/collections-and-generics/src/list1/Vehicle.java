package list1;

public class Vehicle {
	String make;
	String model;
	double price;
	boolean fourWDrive;
	
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", price=" + price + ", fourWDrive=" + fourWDrive + "]";
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isFourWDrive() {
		return fourWDrive;
	}

	public void setFourWDrive(boolean fourWDrive) {
		this.fourWDrive = fourWDrive;
	}

	public Vehicle(String make, String model, double price, boolean fourWDrive) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
		this.fourWDrive = fourWDrive;
	}
	
	
}
