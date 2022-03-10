package generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//These array lists and hashmaps are generics
//		ArrayList<String> myList = new ArrayList<String>();
		Container<Integer, String> container = new Container<Integer, String>(12, "Hello");
		
		container.printItems();
		container.setItem1(15);
		container.printItems();
		
		//Every collection class has an iterator, so not always necessary to use a for loop. 
		//next method gives us the value from the collection. 
		
		Set<String> set1 = new HashSet<String>();
		set1.add("Hello");
		set1.add("Goodday");
		set1.add("One");
		set1.add("Two");
		
		Set<String> set2 = new HashSet<String>();
		set1.add("Hello");
		set1.add("Bye Bye");
		set1.add("Five");
		set1.add("Two");
		
		
		Set<String> myUnion = union(set1, set2);
		
		Iterator<String> itr = myUnion.iterator();
		while(itr.hasNext()) {
		
			System.out.println(itr.next());
		}
		
		
		Object myObject = new Object();
		String myVar = "Hello";
		
		myObject = myVar;
		
		ArrayList<?> employees2 = new ArrayList<>();
		
		ArrayList<Container> mySecondContainer = new ArrayList<>();
		employees2 = mySecondContainer;
		
		
		//ArrayList<? extends Employee> employee3 = new ArrayList<>();
		//Upper bound of the type that can be accepted., 
		
	}
	
	
	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
		Set<E> result = new HashSet<E>(set1);
		result.addAll(set2);
		return result;
		
	}

}
