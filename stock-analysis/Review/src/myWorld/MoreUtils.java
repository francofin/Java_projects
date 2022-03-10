package myWorld;

public class MoreUtils {
	
	public static void askForInput(String [] args) {
		
		for (String arg : args) {
			if(arg != null) {
				System.out.println("I have added "+ arg +" To the Database");
			}
			else {
				continue;
			}
			
		}
	}

}
