package java_basics;

public class VariablesCont {

	public static void main(String[] args) {
		int var = 1000000000;
		long bigNumber = 100000000000L;
		short smallNumber = 32767;
		byte reallySmallNumber = 127;
		double decimals = 2098.777;
		boolean decision = true;
		char letter = 'j';
		
		double [] values = new double[100];
		values[2] = 1000;
		values[99] = 93432;
		values[35] = 48885.88;
		
		System.out.println(values[35]);
		
		String [] words = new String[] {"My", "Name", "is"};
		
		System.out.println(words[0] + " " + words[1]+ " " + words[2]);
		
		String [] words2 = new String[20];
		words2[0] = "Hello";
		words2[1] = "World";
		
		System.out.println(words2[0] + " " + words2[1]);
		
		
	}

}
