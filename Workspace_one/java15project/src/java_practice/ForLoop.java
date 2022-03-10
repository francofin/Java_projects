package java_practice;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String name = "abcdefghijklmnopqrstuvwxyz";
//		for (int i = 0; i<name.length(); i++) {
//			System.out.println("i: "+name.charAt(i));
//		}
//		
//		System.out.println("In reverse Now.");
//		
//		stringReversal(name);
		
		evenNumberGenerator();

	}
	
	public static void stringReversal(String string) {
		
		int stringLength = string.length()-1;
		for (int i=stringLength; i>=0; i--) {
			System.out.println("char in reverse: "+string.charAt(i));
		}
	}
	
	public static void evenNumberGenerator() {
		
		for (int i=0; i<=100; i++) {
			if(i%2==0) {
				System.out.println("even: "+i);
			} else {
				;
			}
		}
	}

}
