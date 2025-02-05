package Sealed_class_Interface;

sealed class Employee permits PermanentEmployee{
	void displayEmployee() {
		System.out.println("Inside the Employee class");
	}
}

non-sealed class PermanentEmployee extends Employee{
	void displayPermanentEmployee() {
		System.out.println("Inside the Permanent Employee class");
	}
}

class ContractEmployee extends PermanentEmployee{
	 void displayContractEmployee() {
			System.out.println("Inside the Contract Employee class");
	 }
}

public class SealedClass {
public static void main(String[] args) {
		
		ContractEmployee ce = new ContractEmployee();
		ce.displayEmployee();
		ce.displayPermanentEmployee();
		ce.displayContractEmployee();
			
	}
}
