package ObjectClass;

import java.util.Objects;

class Employee{
	private int empNo;
	private String empName;
	public Employee(int empNo, String empName) {
		super();
		this.empNo = empNo;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + "]";
	}
	@Override
	public int hashCode() {
		return empNo;
	}
	public boolean equals(Employee obj) {
		if(empNo == obj.empNo) {
			if(empName.equals(obj.empName)) {
				return true;
			}
		}
		return false;
	}
	
}

public class ObjectClass {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Som"); //compiler writes here emp1.toString()  
		Employee emp2 = new Employee(1, "Som"); //compiler writes here emp2.toString()  
		Employee emp3 = new Employee(2, "Jon"); //compiler writes here emp3.toString()  

		System.out.println(emp1.getClass());

		System.out.println(" \nIs employee1 equals employee2 : " + emp1.equals(emp2));
		System.out.println("Hashcode values of employee1 and employee2 : " + emp1.hashCode() + " " + emp2.hashCode());

		System.out.println(" \nIs employee1 equals employee3 : " + emp1.equals(emp3));
		System.out.println("Hashcode values of employee1 and employee3 : " + emp1.hashCode() + " " + emp3.hashCode());
	}

}
