package myWorld;

public class Human {
	
	String name;
	int height;
	int age;
	String eyeColor;
	String profession;
	double intelligenceLevel;
	double salary;
	String primarySchool;
	boolean finishedPrimary;
	String highSchool;
	boolean finishedHighSchool;
	String college;
	String degreeTypeForCollege;
	boolean finishedCollege;
	String collegePost;
	String degreeTypeForPost;
	boolean attainedPostDegree;
	int numberOfFamilyMemebers;
	String countryBorn;
	String countryRaised;
	
	
	
	
	
	
	public Human(String name, int height, int age, String eyeColor, double intelligenceLevel) {
		super();
		this.name = name;
		this.height = height;
		this.age = age;
		this.eyeColor = eyeColor;
		this.intelligenceLevel = intelligenceLevel;
	}


	public void speak() {
		System.out.println("Hello my name is " + this.name);
		System.out.println("I am a "+ this.profession);
		System.out.println("I am "+ this.age + " years old ");
		System.out.println("My IQ is "+Math.round(this.intelligenceLevel));
	}
	
	
	public void eat(boolean hungry) {
		if (hungry) {
			//Add ability to consider why a person is hungry, what variables are affecting their hunger
			//What time of day is it, what have they done today, 
			System.out.println("I am hungry going to eat");
		}
		else {
			System.out.println("I am good, not too hungry now");
		}
	}
	
	
	public void work(boolean broke) {
		//Add ability for how to consider what to do, may need to call another method in here. 
		if(broke) {
			System.out.println("Better keep learning, You got dreams");
		} else {
			System.out.println("Time to rest, relax and enjoy, the fruits of your labour.");
		}
	}
}
