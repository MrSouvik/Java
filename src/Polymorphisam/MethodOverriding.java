package Polymorphisam;
class Employee{
    int salary;
    int basicSalary=15000;
    public void calculateSalary(){
        salary=basicSalary;
        System.out.println("Basic Salary : " + salary);
    }
   
}
class PermanentEmployee extends Employee{
    int HRA = 4000;
    int DA = 3500;
    @Override
    public void calculateSalary(){
        salary=basicSalary + HRA + DA;
        System.out.println("Permanent Employee Salary : " + salary);
    }
}
public class MethodOverriding {
	public static void main(String[] args){
        Employee emp = new Employee();
        emp.calculateSalary();
        Employee emp1 = new PermanentEmployee();
        emp1.calculateSalary();
    }
}
