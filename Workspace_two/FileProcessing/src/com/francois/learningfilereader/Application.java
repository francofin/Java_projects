package com.francois.learningfilereader;

import java.io.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("myfile.txt");
//		BufferedReader bufferedReader = null;
//		FileReader fileReader = null;
		try (FileReader fileReader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(fileReader);){
			
//			fileReader = new FileReader(file);
//			bufferedReader = new BufferedReader(fileReader);
			String line = bufferedReader.readLine();
			
			while (line!=null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File does not exist, please check the name of the file.");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Problem Reading file "+file.getName());
			e.printStackTrace();
		} 
//			finally {
//			try {
//				if (bufferedReader != null) {
//					bufferedReader.close();
//				}
//				if (fileReader !=null) {
//					fileReader.close();
//				}
//			
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				System.out.println("Unable to close file.");
//				e.printStackTrace();
//			} 
//		}
		

	}

}
