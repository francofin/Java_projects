import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> words = new ArrayList<String>();
		words.add("Hello");
		words.add("What Up");
//		words.add(10);
//		words.add(50.55);
//		words.remove(0);
		
		String item1 = (String) words.get(0);
		System.out.println(item1);
		Object item2 = words.get(1);
//		int item3 = (int) words.get(2);
//		double item4 = (double) words.get(3);
		System.out.println(item2);
		for (String str: words) {
			System.out.println(str);
		}
		
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(55);
		numbers.add(25);
		numbers.add(35);
		numbers.add(70);
		numbers.remove(3);
		System.out.println(numbers.get(0)+numbers.get(1));
		
		for(int number : numbers) {
			System.out.println(number);
		}
		
		
		
	}

}
