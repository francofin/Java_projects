package client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
	
		ArrayList<String> myList = new ArrayList<>();
		myList.add("Some Cool Things to analyze");
		
		
		ArrayList<HashMap<String, Integer>> myCrazyList = new ArrayList<>();
		
		Container<Integer, String> container = new Container<>(12, "Hello");
		int myVar = container.getItem1();
		String myVar2 = container.getItem2();
		
		container.printItems();
		
		Set<String> mySet1 = new HashSet<>();
		mySet1.add("First");
		mySet1.add("Second");
		mySet1.add("Third");
		
		Set<String> mySet2 = new HashSet<>();
		mySet1.add("Fourth");
		mySet1.add("Third");
		mySet1.add("Second");
		
		
		Set<String> resultSet = union(mySet1, mySet2);
		System.out.println(resultSet);
		
		Iterator<String> itr = resultSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}
	
	
	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
		
		Set<E> result = new HashSet<>(set1);
		result.addAll(set2);
		
		return result;
	}

}
