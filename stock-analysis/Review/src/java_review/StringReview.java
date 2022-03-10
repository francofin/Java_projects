package java_review;

public class StringReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello World Today, keep coding and learning and you will achieve.";
		String myName = "Francois";
		
		String extractedString = str.substring(2,6);
		System.out.println(extractedString);
		
		if(str.substring(0,5).equals("Hello")) {
			System.out.println("This works");
		}
		
		if(str.substring(6,11).equalsIgnoreCase("world")) {
			System.out.println("This also works");
		}
		
		
		int a  = str.indexOf("keep");
		System.out.println(a);
		
		
		System.out.println(myName.length());
		
		int count = 0;
		
		while(count < myName.length()) {
			System.out.println(count+"."+ myName.substring(count,count+1));
			count+=1;
			if(myName.substring(count,count+1).equals("i")) {
				break;
			}
		}
		
		String categoryListing = "We have a large inventory of things in our warehouse falling in "+
		"the category:appeal and the slightly more in demain category:makeup along with the category:furniture and...";
		
		printCategories(categoryListing);
		
		printReverse(categoryListing);
		
//		for(int i =0; i<100; i++) {
//			System.out.println("i: "+i);
//		}
		
	}
	
	//Method to print a sentence in reverse
	
	public static void printReverse(String arg) {
		
		String [] wordList = arg.split(" ");
		String [] newList = new String [wordList.length];
		int counter = wordList.length-1;
		int j = 0;
		
		while(counter >= 0) {
			newList[j] = wordList[counter];
			j +=1;
			counter -=1;
		} 
		String reversed = "";
		for(String word: newList) {
			reversed += word + " ";
		}
		System.out.println(reversed);
	}
	
	public static void printCategories(String arg) {
		
		int counter = 0;
		String [] wordList = arg.split(" ");
		System.out.println(wordList.length);
		for(String word: wordList) {
			if(word.indexOf("category") != -1) {
				String[] category = word.split(":");
				System.out.println("Category: "+ category[1]);
			}
			
		}

		
	}

}
