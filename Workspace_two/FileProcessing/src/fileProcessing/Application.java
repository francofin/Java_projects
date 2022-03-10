package fileProcessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Some Text: ");
		String enteredText = input.nextLine();
		System.out.println(enteredText);
		input.close();

		try {
			File file = new File("myfile2.txt");
			Scanner input2;

			input2 = new Scanner(file);

			while (input2.hasNextLine()) {
				System.out.println(input2.nextLine());
			}
			input2.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File Not Found");
//			e.printStackTrace();
		}
		
		MyFileUtils myUtil = new MyFileUtils();
		try {
			System.out.println(myUtil.subtract10FromLargerNumber(8));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
