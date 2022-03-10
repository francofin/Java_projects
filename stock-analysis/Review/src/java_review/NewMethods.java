package java_review;
import myWorld.*;

public class NewMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		
		String [] myArray = new String [100];
		int [] numbersToSum = new int [] {6, 8, 9, 7};
		
		
		
		
		String myTitle = "Senior Developer";
		
		MyUtils.printStuff(myTitle);
//		MyUtils.printStuff(100);
		MyUtils.sumNumbers(numbersToSum);
		
		String [] newCustomers = new String [100];
		
		newCustomers[0] = "Tommy";
		newCustomers[1] = "Miguel";
		newCustomers[2] = "Halanai";
		
		MoreUtils.askForInput(newCustomers);
		
	}	
	
	
}
