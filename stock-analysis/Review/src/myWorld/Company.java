package myWorld;

public class Company {
	

	String companyName;
	int age;
	long companyMarketCap;
	int employeeCount;
	String [] contryOfOperations = new String [100];
	
	
	
	public Company(String companyName, int age, long companyMarketCap, int employeeCount) {
		super();
		this.companyName = companyName;
		this.age = age;
		this.companyMarketCap = companyMarketCap;
		this.employeeCount = employeeCount;
	}



	public void getCompanyName() {
		System.out.println("We are " + this.companyName);
	}

}
