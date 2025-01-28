package Inheritance;

class Employee{
    int empId;
    int basicSalary=20000;
    public int getEmpId(){
        return empId;
    }
    public void setEmpId(int empId){
        this.empId = empId;
    }
}
class PermanentEmployee extends Employee{
    int salary;
    int HRA = 4000;
    int DA = 1000;
    public void calculateSalary(){
        salary=basicSalary + HRA + DA;
        System.out.println("Salary of Permanent Employee : " + salary);
        
    }
}
public class SingleInheritance {
	public static void main(String[] args) {
		 PermanentEmployee per = new PermanentEmployee();
	     per.setEmpId(10214);
	     System.out.println("Employee ID : " + per.getEmpId());
	     per.calculateSalary();
	}
}
