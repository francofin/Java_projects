package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import com.franco.exceptions.*;
 
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Some text:");
		String enteredtext = input.nextLine();
		
		Scanner input2 = new Scanner(System.in);
		
		
		System.out.println(enteredtext);
		
		File anotherFile = new File("myfile.txt");

		try (FileReader fileReader = new FileReader(anotherFile);
				BufferedReader bufferedReader = new BufferedReader(fileReader);){
			
			//We need this buffered reader in order to read the file from file reader. This buffers the characters into lines. 
			//File reader reads everything into characters
			//we can add a catch clause
			String line = bufferedReader.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("File was not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Problem Reading the file "+anotherFile.getName());
		}
//		finally {
//			//executes at the end of the try or the catch block regardless of what happens
//			try {
//				if(bufferedReader !=null) {
//					bufferedReader.close();
//				}
//				if(fileReader !=null) {
//					fileReader.close();
//				}
//				
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		
		
		try {
			File file = new File("myfile.txt");
			System.out.println(file.getAbsolutePath());
			Scanner fileInput = new Scanner(file);
			while(fileInput.hasNextLine()) {
				String line = fileInput.nextLine();
//				fileInput.findInLine("we must");
				System.out.println(line +":"+ enteredtext);
			}
			fileInput.close();
			
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File was not found.");
		}
		
		try {
			System.out.println(subtract10FromLargerNumber(20));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static int subtract10FromLargerNumber(int number) throws Exception{
		if(number < 10) {
			throw new Exception("Number must be larger than 10");
		}
		return number-10;
	}
	

}
