package Objects;

public class Chicken extends Bird implements Flyable{

	public Chicken(String phylus, String type_of_animal, int age, double weight, boolean is_mammal,
			boolean is_poisonous, String name) {
		super(phylus, type_of_animal, age, weight, is_mammal, is_poisonous, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("This chicken can fly.");
	}
	

}
