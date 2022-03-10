package Objects;

public class Bird extends Animal{
	String name;
	
	public Bird(String phylus, String type_of_animal, int age, double weight, boolean is_mammal, boolean is_poisonous,
			String name) {
		super(phylus, type_of_animal, age, weight, is_mammal, is_poisonous);
		this.name = name;
	}


	public void move() {
		// TODO Auto-generated method stub
		System.out.println("The bird is flapping its wings.");
	}
	

}
