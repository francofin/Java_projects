package fileProcessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryandCatch {
	
	public static void runTryandCatch() {
		try {
			File file = new File("myfile.txt");
			Scanner input2;
			input2 = new Scanner(file);
			
			while(input2.hasNextLine()){
				System.out.println(input2.nextLine());
			}

			input2.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	

}
