package java_review;

public class MyUtils {
	
	public static void printStuff(String words) {
		System.out.println("I am a " + words);
	}
	
	private static void printStuff(int numbers) {
		System.out.println("I am a " + numbers);
	}
	
	public static void sumNumbers(int [] myNumbers ) {
		
		int counter = 0;
		
		for(int no : myNumbers) {
			counter+=no;
		}
		
		System.out.println("Total is " + counter);	
		printStuff(counter);
	}
	
	//void methods cannot return a value. 
	
	
	public int addTen(int myNumbers) {
		int result = myNumbers +10;
		
		return result;
	}


}
