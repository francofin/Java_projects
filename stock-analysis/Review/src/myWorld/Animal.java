package myWorld;

public abstract class Animal {
	
	String name;
	int age;
	String gender;
	boolean isPoisonous;
	boolean isTame;
	
	public Animal( String name, int age, String gender, boolean isPoisonous, boolean isTame) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.isPoisonous = isPoisonous;
		this.isTame = isTame;
	}
	
	public void eat() {
		System.out.println("Eating");
	}
	
	public abstract void move();
	
	public void checkForAccess() {
		if (this.isPoisonous) {
			System.out.println("This animal is dangerous, please keep people away");
		} else {
			System.out.println("This animal is safe, Petting allowed");
		}
	}

	

}
