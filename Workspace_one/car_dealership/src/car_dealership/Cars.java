package car_dealership;

import java.util.Objects;

public class Cars {
	
	private String make;
	private String model;
	String typeOfCar;
	private double price;
	private int hp;
	String color;
	private boolean isUsed;
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

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public boolean isUsed() {
		return isUsed;
	}

	public void setUsed(boolean isUsed) {
		this.isUsed = isUsed;
	}

	short year;
	
	public Cars(String make, String model, String typeOfCar, double price, int hp, String color, boolean isUsed,
			short year) {
		super();
		this.make = make;
		this.model = model;
		this.typeOfCar = typeOfCar;
		this.price = price;
		this.hp = hp;
		this.color = color;
		this.isUsed = isUsed;
		this.year = year;
	}

	public double getPrice(Customer customer) {
		
		if (customer.returningCustomer) {
			price = price - 5000.0;
		} else {
			;
		}
		
		return price;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(color, hp, isUsed, make, model, price, typeOfCar, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cars other = (Cars) obj;
		return Objects.equals(color, other.color) && hp == other.hp && isUsed == other.isUsed
				&& Objects.equals(make, other.make) && Objects.equals(model, other.model)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(typeOfCar, other.typeOfCar) && year == other.year;
	}

	@Override
	public String toString() {
		return "Cars [make=" + make + ", model=" + model + ", typeOfCar=" + typeOfCar + ", price=" + price + ", hp="
				+ hp + ", color=" + color + ", year=" + year + "]";
	}

	public void setPrice(double price) {
		this.price = price;
	}



}
