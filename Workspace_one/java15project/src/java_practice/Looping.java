package java_practice;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		while(count <= 10) {
			System.out.println("Francois"); System.out.println(count);
			System.out.println("Francois: " + count);
			if (count== 5) {
				break;
			}
			count +=1;	
		}
		
		String sentence = "We have a large inventory of things in our warehouse falling in the category:apparel, "
				+" and the slightly more in demand category:makeup along with the category:furniture and other stuff";
		
		String [] strArray = sentence.split(":");
		
		
		
		System.out.println(sentence.indexOf(":",0));
		
		String[] all_categories = printCategories(sentence);
		
		for (String category: all_categories) 
			System.out.println(category);
		
		System.out.println(all_categories.length);
		
		printFromTut(sentence);

	}
	
	
	
	public static String[] printCategories(String arg) {
//		Extract all categories from the string argument

		String [] splitString = arg.split(":");
		String [] categories = new String [splitString.length];
		
		int i = 1;
		while (i <= splitString.length-1) {
			categories[i] = splitString[i].substring(0,splitString[i].indexOf(" ",0));
			i+=1;
		}

		return categories;
		
	}
	
	public static void printFromTut(String string) {
		
		int i = 0;
		while(true) {
			int found = string.indexOf("category:", i);
			if (found == -1)
				break;
			int start = found+9;
			int end = string.indexOf(" ", start);
			System.out.println(string.substring(start, end));
			i = end+1;
		}
	}

}
