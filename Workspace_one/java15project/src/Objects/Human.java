package Objects;

public class Human {
	String name;
	int age;
	double heighInches;
	String eyeColor;
	String profession;
	
	
	public Human(String name, int age, double heighInches, String eyeColor, String profession) {
		super();
		this.name = name;
		this.age = age;
		this.heighInches = heighInches;
		this.eyeColor = eyeColor;
		this.profession = profession;
	}

	public void speak() {
		System.out.println("Hello my name is "+ name);
		System.out.println("I am "+ heighInches+ " tall");
		System.out.println("My eyes are " + eyeColor);
		System.out.println("I am "+age+ " years old");
		System.out.println("I am a "+profession);
		
	}
	
	public void eat() {
		System.out.println("eating....");
	}
	
	public void walk() {
		System.out.println("walking...");
	}
	
	public void work() {
		System.out.println("Working....");
	}
}
