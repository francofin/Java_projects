package java_basics;

public class ControlFlow {

	public static void main(String[] args) {
		boolean hungry = true;
		
		if(!hungry) {
			System.out.println("Time to eat");
			System.out.println("I have eaten");
			hungry = false;
		} else {
			System.out.println("I am no longer Hungry");
		}
		
		int hungerRating = 5;
		
		if(!(hungerRating < 6)) {
			System.out.println("Not Hungry");
		} else {
			System.out.println("I am starving");
		}
		
		double favoriteTemp = 65;
		double currentTemp = 100;
		String opinion;
		
		if(currentTemp < (favoriteTemp-30)) {
			opinion = "Its too damn cold";
		} else if(currentTemp <= favoriteTemp-20) {
			opinion = "Its Cold but not that bad";
		} else if (currentTemp >favoriteTemp +10) {
			opinion = "Its hot";
		} else {
			opinion = "Its perfect out";
		}
		
		System.out.println(opinion);
		
		int month = 3;
		String monthString;
		
		switch(month) {
		
		case 1: monthString = "January";
			break;
		case 2: monthString = "February";
			break;
		case 3: monthString = "March";
			break;
		case 4: monthString = "April";
			break;
		case 5: monthString = "May";
			break;
		default: monthString = "Unknown Month";
			break;
		}
		
		System.out.println(monthString);

	}

}
