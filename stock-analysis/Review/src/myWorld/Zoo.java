package myWorld;

public class Zoo {
	
	boolean isOpen;
	int numberOfAnimals;
	String location;
	int maxAnimals =100;
	
	
	
	public Zoo(int numberOfAnimals, String location) {
		super();
		this.numberOfAnimals = numberOfAnimals;
		this.location = location;
	}



	public int addAnimalToDatabase() {
		if (this.numberOfAnimals == this.maxAnimals) {
			System.out.println("This animal cannot stay here, as the zoo is full.");
		}
		else {
			
			this.numberOfAnimals +=1;
			System.out.println("Animal Added to data, there are now "+this.numberOfAnimals+" in the zoo.");
		}
		
		return this.numberOfAnimals;
	}

}
