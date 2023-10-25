package sunbeam.ass02;

public class Employee {
	String firstName ;
	String lastName ;
	double salary ;
	
	public Employee() {
		this("","",0);
	}
	public Employee(String firstName, String lastName, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		if(salary<0) {
			salary = 0;
		}
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void positiveSalary() {
	
		System.out.println("Enter the Yearly salary" +salary*12);
		
	} 
		
	public void incrementSalary() {
		System.out.println("the monthly salary increased is : " +salary*12*0.1);
	}


}
