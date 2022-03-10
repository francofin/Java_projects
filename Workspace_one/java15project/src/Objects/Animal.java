package Objects;

public class Animal {
	String phylus;
	String type_of_animal;
	int age;
	double weight;
	boolean is_mammal;
	boolean is_poisonous;
	
	public Animal(String phylus, String type_of_animal, int age, double weight, boolean is_mammal, boolean is_poisonous) {
		super();
		this.phylus = phylus;
		this.type_of_animal = type_of_animal;
		this.age = age;
		this.weight = weight;
		this.is_mammal = is_mammal;
		this.is_poisonous = is_poisonous;
		
	}
	
	public void animal_info() {
		System.out.println("I am a "+type_of_animal);
		if(is_mammal) {
			System.out.println("I am a mammal");
		} else {
			System.out.println("I am not a mammal");
		}
		if (is_poisonous) {
			System.out.println("I am poisonous be careful");
		} else {
			System.out.println("I am not poisonous come say hello.");
		}
		
	}
	
	public void eat() {
		System.out.println("Eating");
	}
	
	public void play() {
		System.out.println("Playing");
	}
	
	public void interact(boolean poison_level) {
		if (poison_level) {
			System.out.println("This animal is posionous, Please try to avoid interactions with the animal");
		} else {
			System.out.println("This animal can be your best friend show them all the love.");
		}
	}
	

	

}
