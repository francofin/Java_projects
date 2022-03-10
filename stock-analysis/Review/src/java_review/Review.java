package java_review;

public class Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World time to review");
		
		int x;
		x = 34;
		
		System.out.println(x);
		String words;
		words = "My own string that I am declaring";
		
		System.out.println(words);
		
		int [] values;
		String [] dictionary;
		String [] anotherDictionary;
		values = new int[100];
		dictionary = new String [50];
		
		values[0] = 1000;
		dictionary[0] = "Hello";
		
		anotherDictionary = new String[] {"What", "The", "Fuck", "Is", "Up"};
		
		boolean hungry = true;
		hungry=false;
		
		
		if(hungry) {
			values[1] = 5000;
		}
		else {
			dictionary[1] = "You Got Skipped";
		};
		
		if(dictionary[1]!=null) {
			System.out.println(dictionary[1]);
		}else {
			System.out.println(values[1]);
			
		}
		
		
		int month = 3;
		String monthString = "June";
		
		switch(month) {
			case 1:
				monthString = "January";
				break;
			case 2:
				monthString = "February";
				break;
			case 3:
				monthString = "March";
				break;
			case 4:
				monthString = "April";
				break;
			default:
				monthString = "June";
				break;
		}
		
		System.out.println(monthString);
				
	}

}
