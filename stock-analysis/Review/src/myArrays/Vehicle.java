package myArrays;

import java.util.Objects;

public class Vehicle implements Comparable<Vehicle> {
	
	String make;
	String model;
	double price;
	boolean fourWDrive;
	
	
	public Vehicle(String make, String model, double price, boolean fourWDrive) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
		this.fourWDrive = fourWDrive;
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
	public void setModel(String moddel) {
		this.model = moddel;
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


	@Override
	public String toString() {
		return "make=" + make + ", model=" + model + ", price=" + price ;
	}


	@Override
	public int hashCode() {
		return Objects.hash(fourWDrive, make, model, price);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return fourWDrive == other.fourWDrive && Objects.equals(make, other.make) && Objects.equals(model, other.model)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}


	@Override
	public int compareTo(Vehicle o) {
		// TODO Auto-generated method stub
		if(this.getPrice() < o.getPrice()) {
			return -1;
		} else if (this.getPrice() > o.getPrice()) {
			return 1;
		}
		return 0;
	}
	
	
	
	
	

}
