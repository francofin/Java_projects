package myWorld;

public class Industry {
	
	String name;
	double marketCap;
	String [] operationCountries = new String [100];
	
	
	
	public Industry(String name) {
		super();
		this.name = name;
	}



	public void getIndustry() {
		System.out.println("I belong to "+this.name+" Industry");
	}
	

}
