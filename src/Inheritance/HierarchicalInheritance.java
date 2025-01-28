package Inheritance;
class Employee2{
    int empId;
    int basicSalary=20000;
    public int getEmpId(){
        return empId;
    }
    public void setEmpId(int empId){
        this.empId = empId;
    }
}
class PermanentEmployee2 extends Employee2{
    int salary;
    int HRA = 4000;
    int DA = 1000;
    public void calculateSalary(){
        salary=basicSalary + HRA + DA;
        System.out.println("Salary of Permanent Employee : " + salary);
    }
}
class TemparoryEmployee2 extends Employee2{
    int salary;
    int HRA = 2000;
    public void calculateSalary(){
        salary=basicSalary + HRA;
        System.out.println("Salary of Temparory Employee : " + salary);
    }
}
public class HierarchicalInheritance {
	public static void main(String[] args) {
		PermanentEmployee per = new PermanentEmployee();
        per.setEmpId(10214);
        System.out.println("Employee ID : " + per.getEmpId());
        per.calculateSalary();
        TemparoryEmployee2 temp = new TemparoryEmployee2();
        temp.setEmpId(10215);
        System.out.println("Employee ID : " + temp.getEmpId());
        temp.calculateSalary();
	}
}
