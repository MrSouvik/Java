package ThisKeyword;

public class This_AppliedOnDefaultConstructor {
	public static void main(String[] args) {
		StudentData sd = new StudentData(10);
	}
}
class StudentData {
	
	StudentData() {
		System.out.println("Inside default constructor");
	}

	StudentData(int value) {
	    //this applied on default constructor
		this();
		System.out.println("Inside parameterized constructor");
	}

}
