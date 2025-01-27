package SuperKeyword;

class Employee {
	int salary = 10000;
	Employee(){
		this.salary = 10000;
	}
	Employee(int salary){
		this.salary = salary;
	}
	
	public void displaySalary() {
		System.out.println("Basic Employee Salary is: "+salary);
	}
}

class PermanentEmployee extends Employee{
	int salary = 20000;
	
	void display() {
		//super keyword applied at attribute level
		System.out.println("Employee Salary is: "+super.salary);
		System.out.println("Permanent Employee Salary is: "+salary);
	}
	
	//super keyword applied at method level
	@Override
	public void displaySalary() {
		super.displaySalary();
		System.out.println("Permanent Employee salary is: "+salary);
	}
}

class ContractEmployee extends Employee{
	int noOfHours;
	
	//super keyword applied applied at constructor level
	public ContractEmployee() {
		super();
		this.noOfHours = 20;
	}
	
	public ContractEmployee(int salary, int noOfHours) {
		super(salary);
		this.noOfHours = noOfHours;
	}
	
	public void display() {
		System.out.println("Details of Contract Employee is: "+noOfHours+ "hours with Salary: "+salary);
	}
	
}
public class SuperKeyword {
	public static void main(String[] args) {
		PermanentEmployee pe = new PermanentEmployee();
		pe.display();
		
		pe.displaySalary();
		
		ContractEmployee ce1 = new ContractEmployee();
		ce1.display();
		
		ContractEmployee ce2 = new ContractEmployee(30000, 30);
		ce2.display();
		
	}
}
