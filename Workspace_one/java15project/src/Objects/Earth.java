package Objects;

public class Earth {
	public static void main(String[] args) {

//		Human jane;
//		jane = new Human();
//		jane.age = 19;
//		jane.eyeColor = "blue";
//		jane.name = "Jane Cajawoski";
//		jane.profession = "Developer";
//		jane.heighInches = 114;
//		jane.speak();
//		jane.eat();
		
		Human francois = new Human("Francois", 32, 70,"brown", "Developer" );
		francois.speak();
		
		Animal jackie = new Animal("Caninia", "Wolf", 11, 42.55, true, true);
		jackie.animal_info();
		jackie.interact(true);
		
		Bird twinkie = new Bird("Flyer", "Canary", 7, 5.0, false, false, "Twinkie");
		twinkie.animal_info();
		
		Chicken clucker = new Chicken("Flyer", "Canary", 7, 5.0, false, false, "Twinkie");
		clucker.move();
	}
}
