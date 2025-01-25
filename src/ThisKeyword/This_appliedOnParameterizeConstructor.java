package ThisKeyword;

public class This_appliedOnParameterizeConstructor {
	public static void main(String[] args) {
		Student_Data sd = new Student_Data();
	}
}
class Student_Data {
	
	Student_Data() {
	    //this keyword on parameterized constructor
	    this(10);
		System.out.println("Inside default constructor");
	}

	Student_Data(int value) {
		System.out.println("Inside parameterized constructor");
	}
}
