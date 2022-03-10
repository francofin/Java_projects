package list1;

import java.util.Objects;

public class Employees implements Comparable<Employees>{
	String name;
	int age;
	double salary;
	String title;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name, salary, title);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employees other = (Employees) obj;
		return age == other.age && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary)
				&& Objects.equals(title, other.title);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	@Override
	public String toString() {
		return "Employees [name=" + name + ", age=" + age + ", salary=" + salary + ", title=" + title + "]";
	}


	public Employees(String name, int age, double salary, String title) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.title = title;
	}


	@Override
	public int compareTo(Employees o) {
		// TODO Auto-generated method stub
		if(this.salary<o.salary) {
			return -1;
		} else if(o.salary > this.salary) {
			return 1;
		}
		return 0;
	}
	
}
