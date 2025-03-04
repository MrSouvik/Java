package Practice;

public class StaticKeyword {
	
	static int schoolId; //static variable
	int rollNo; //non-static variable
	//static block
	static { 
		schoolId = 100;
		//rollNo = 02; // Non static variable can not be accessed inside static block
	}
	
	static void display(int rollNo) { //static method
		System.out.println("School ID "+schoolId+ " Roll No "+rollNo);
	}
	public static void main(String[] args) {
		System.out.println("Schhol ID "+StaticKeyword.schoolId); //static variables can be access using class name
		StaticKeyword student1 = new StaticKeyword();
		student1.rollNo = 1;
		StaticKeyword.display(student1.rollNo);//static method can be called using class name
		StaticKeyword student2 = new StaticKeyword();
		student2.rollNo = 2;
		StaticKeyword.display(student2.rollNo);
		
		
	}
}
