package myWorld;

public class Dog extends Canine implements Howlable{
	
	
	public Dog( String name, int age, String gender, boolean isPoisonous, boolean isTame) {
		super(name, age, gender, isPoisonous, isTame);
		// TODO Auto-generated constructor stub
	}

	public void bark() {
		System.out.println("Barking...");
	}
	
	public void howl() {
		System.out.println("Howling for food.");
	}
	
	
	
	

}
