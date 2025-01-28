package Inheritance;

class Employee1{
    int empId;
    int basicSalary=15000;
    public int getEmpId(){
        return empId;
    }
    public void setEmpId(int empId){
        this.empId = empId;
    }
}
class PermanentEmployee1 extends Employee1{
    int salary;
    int HRA = 4000;
    int DA = 1000;
    public void calculateSalary(){
        salary=basicSalary + HRA + DA;
        System.out.println("Salary of Permanent Employee : " + salary);
        
    }
}
class Developer extends PermanentEmployee1{
    int bonus=5000;
    @Override
    public void calculateSalary(){
        salary=basicSalary + HRA + DA + bonus;
        System.out.println("Salary of Developer : " + salary);
    }    
}
public class MultilevelInheritance {
	public static void main(String[] args){
        Developer dev = new Developer();
        dev.calculateSalary();
    }
}
