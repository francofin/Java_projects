package myWorld;

public class Earth {
	
	public static void main(String [] args) {
		
		Human tom = new Human("Tom", 76, 20, "Brown", 150.77);
		tom.profession = "Hedge Fund Analyst";
		Human jane = new Human("Jane", 57, 23, "Green", 145.22);
		jane.profession = "Engineer";
		Human mary = new Human("Mary", 63, 22, "Blue", 151.11);
		mary.profession = "CTO of Tesla";
		
		Zoo brookCounty = new Zoo(60, "Brooklyn");
		
		brookCounty.addAnimalToDatabase();
		
		Dog myDog = new Dog("Jimmeny", 5, "M", false, true);
		
		myDog.move();
		
		tom.speak();
		System.out.println("--------------------------------------------------------");
		jane.speak();
		System.out.println("--------------------------------------------------------");
		mary.speak();
		
		
	}

}
