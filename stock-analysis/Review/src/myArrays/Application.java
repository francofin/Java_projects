package myArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> words = new ArrayList<String>();
		words.add("Hello");
		words.add("Another Craziness");
		words.add("Another");
		words.add("Thats Crazy");

		words.remove(1);
		
		String item1 = words.get(0);
		Object item2 = words.get(2);
		Object item3 = words.get(1);
		System.out.println(item1);
		System.out.println(item3);
		
		//Cannot use primitives in this collection. Integer is a wrapper class for int.There are Double, Float, Boolean, Long
		//LinkedList uses a node object.
		//Linked List are slower for retrieval but faster for manipulation.
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(1000000);
		numbers.add(1000);
		numbers.add(99);
		numbers.add(50);
		numbers.remove(2);
		
		for(int no: numbers) {
			System.out.println(no);
		}
		System.out.println(numbers.get(2));
		
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Lion");
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Bird");
		
//		for(int i=0; i<animals.size(); i++) {
//			System.out.println(animals.get(i));
//		}
		
		System.out.println("----------------");
		
		for(String animal: animals) {
			System.out.println(animal);
		}
		
		System.out.println("----------------");
		
		
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>(10);
		Vehicle vehicle2 = new Vehicle("Toyota", "Camry", 1200.99, false);
		Vehicle vehicle3 = new Vehicle("Jeep", "Wrangler", 50000.00, true);
		
		vehicles.add(new Vehicle("Honda", "Accord", 12000.99, false));
		vehicles.add(vehicle2);
		vehicles.add(vehicle3);
		
		for(Vehicle vehicle: vehicles) {
			System.out.println(vehicle);
		}
		
		
		HashSet<Integer> myValueSet = new HashSet<Integer>();
		myValueSet.add(43);
		myValueSet.add(15);
		myValueSet.add(76);
		myValueSet.add(44);
		myValueSet.add(99);
		myValueSet.add(43);
		myValueSet.add(15);
		
		for(int i: myValueSet) {
			System.out.println(i);
		}
		
		//Linked Hashset allows for order to be maintained
		
		LinkedHashSet<Vehicle> myVehicleSet2= new LinkedHashSet<Vehicle>();
		
		Vehicle vehicle4 = new Vehicle("BMW", "M3", 120000.66, true);
		Vehicle vehicle5 = new Vehicle("Tesla", "Model S", 197000.00, true);
		
		myVehicleSet2.add(new Vehicle("Honda", "Accord", 12000.99, false));
		myVehicleSet2.add(vehicle2);
		myVehicleSet2.add(vehicle3);
		myVehicleSet2.add(vehicle4);
		myVehicleSet2.add(vehicle5);
		
		for(Vehicle vehicle: myVehicleSet2) {
			System.out.println(vehicle);
			System.out.println(vehicle.hashCode());
		}
		
		
		ArrayList<Integer> myvaluesAgain = new ArrayList<Integer>();
		myvaluesAgain.add(10);
		myvaluesAgain.add(20);
		myvaluesAgain.add(30);
		myvaluesAgain.add(40);
		myvaluesAgain.add(50);
		myvaluesAgain.add(60);
		myvaluesAgain.add(70);
				
		ArrayList<Integer> myvaluesOtra = new ArrayList<Integer>();
		myvaluesOtra.add(90);
		myvaluesOtra.add(10);
		myvaluesOtra.add(10);
		myvaluesOtra.add(10);
		myvaluesOtra.add(80);
		myvaluesOtra.add(100);
		myvaluesOtra.add(100);
		myvaluesOtra.add(150);
		myvaluesOtra.add(160);
		myvaluesOtra.add(170);
		
		
		myvaluesAgain.addAll(myvaluesOtra);
		
		System.out.println(myvaluesAgain);
		
		myvaluesAgain.retainAll(myvaluesOtra);
		
		System.out.println(myvaluesAgain);
		
		myvaluesAgain.removeAll(myvaluesOtra);
		
		System.out.println(myvaluesAgain);
		
		//retainAll retains everything not in first list that is in the other list
		//We can convert a hashset into a list
		
		ArrayList<Vehicle> listFromHash= new ArrayList<Vehicle>(myVehicleSet2);
		
		//Sort takes only a list type collection. 
		
		Collections.sort(listFromHash);
		
		Collections.sort(words);
		
		System.out.println(listFromHash);
		
		System.out.println(words);
		
		boolean hasValue = myvaluesAgain.contains(40);
		System.out.println(hasValue);
		
//		myvaluesAgain.clear();
		//for user defined classes if we want to sort we need to implement the comparable interface.
		//Maps are key value pairs, hashmaps implements the Map Interface
		
		HashMap<String, String>dictionary = new HashMap<String, String>();
		dictionary.put("hola", "hello");
		dictionary.put("manana", "tomorrow");
		dictionary.put("nosotros", "we");
		dictionary.put("pasajero", "passenger");
		
		for(String word: dictionary.keySet()) {
			System.out.println(word +": " + dictionary.get(word));
		}
		
		//entrySet are both the key and value.
		//In addition to HashMap, there is the Tree Map and the LinkedHashMap, TreeMap sorts based on alphabetical order
		
		for(Map.Entry<String, String> entry: dictionary.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

	}

}
