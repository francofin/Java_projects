package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> values = new HashSet<Integer>();
		values.add(12);
		values.add(43);
		values.add(67);
		values.add(22);
		values.add(77);
		values.add(43);
		
		for (int i : values) {
			System.out.println(i);
		}
		
		System.out.println("-----------------------------------------------");
		
		LinkedHashSet<Integer> valuesLinked = new LinkedHashSet<Integer>();
		valuesLinked.add(12);
		valuesLinked.add(43);
		valuesLinked.add(67);
		valuesLinked.add(22);
		valuesLinked.add(77);
		valuesLinked.add(43);
		
		for (int i : valuesLinked) {
			System.out.println(i);
		}
		
		System.out.println("---------------------------------------------------");
		
		HashSet<Animal> animals = new HashSet<Animal>();
		Animal animal1 = new Animal("Dog", 12);
		Animal animal2  = new Animal("Cat", 13);
		Animal animal3  = new Animal("Bird", 13);
		Animal animal4  = new Animal("Mouse", 13);
		Animal animal5  = new Animal("Dog", 12);
		Animal animal6  = new Animal("Lion", 13);
		
		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		animals.add(animal5);
		animals.add(animal6);
		
		for (Animal i : animals) {
			System.out.println(i);
		}
		
		System.out.println("-------------------------------------------------------");
		
		System.out.println(animal1.equals(animal5));
		System.out.println(animal1.hashCode());
		System.out.println(animal5.hashCode());
		
	}

}
