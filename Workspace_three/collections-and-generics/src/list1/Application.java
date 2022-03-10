package list1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> animals = new ArrayList<String>();
		animals.add("Dog");
		animals.add("Lion");
		animals.add("Zebra");
		animals.add("Bird");
		animals.add("Pig");
		
//		for (int i =0; i<animals.size(); i++) {
//			System.out.println(animals.get(i));
//		}
//		
//		System.out.println("-------------------------------");
//		
//		for (String str: animals) {
//			System.out.println(str);
//		}
		
		LinkedList<Vehicle> vehicles = new LinkedList<Vehicle>();
		Vehicle vehicle2 = new Vehicle("Toyota", "Camry", 15000.00, false);
		vehicles.add(new Vehicle("Honda", "Accord", 12000.00, false));
		vehicles.add(vehicle2);
		vehicles.add(new Vehicle("Jeep", "Wrangler", 25000.00, true));
		
		
//		for(Vehicle vehicle: vehicles) {
//			if(vehicle.fourWDrive==false) {
//				System.out.println(vehicle);
//			}
//			
//		}
		
		printElements(vehicles);
		printElements(animals);
		
		
		HashSet<Integer> list1 = new HashSet<Integer>();
		list1.add(12);
		list1.add(34);
		list1.add(456);
		list1.add(9553);
		list1.add(66363);
		list1.add(67);
		
		List<Integer> li = new ArrayList<Integer>(list1);
		
		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.add(10);
		
		
		li.addAll(newList);
		
		System.out.println(li);
		
		li.retainAll(newList);
		
		System.out.println(li);
		
		li.removeAll(newList);
		
		System.out.println(li);
		
		boolean hasValue = li.contains(67);
		
		System.out.println(hasValue);
		
		boolean hasAnotherValue = li.isEmpty();
		
		System.out.println(hasAnotherValue);
		
		
		
		li.clear();
		
		System.out.println(li);
		
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(12);
		hashSet.add(34);
		hashSet.add(456);
		hashSet.add(9553);
		hashSet.add(66363);
		hashSet.add(67);
		
		
		ArrayList<Integer> myListFromHash = new ArrayList<Integer>(hashSet);
		
		Collections.sort(myListFromHash);
		
		System.out.println(myListFromHash);
		
		HashSet<Employees> employees = new HashSet<Employees>();
		employees.add(new Employees("Tom", 22, 25000.00, "Sales Rep"));
		employees.add(new Employees("Emily", 27, 65000.00, "Accountant"));
		employees.add(new Employees("Mike", 27, 65000.00, "Manager"));
		employees.add(new Employees("Sally", 28, 75000.00, "Lead Product Developer"));
		employees.add(new Employees("Francois", 32, 125000.00, "Lead Developer"));
		
		
		ArrayList<Employees> employeesFromHash = new ArrayList<Employees>(employees);
		
		Collections.sort(employeesFromHash);
		System.out.println(employeesFromHash);
		
		
	}
	
	public static void printElements(List someList) {
		for (int i = 0; i<someList.size(); i++) {
			System.out.println(someList.get(i));
		}
	}

}
