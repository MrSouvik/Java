package ThisKeyword;

class This_AppliedOnInstanceVeriable {
	int studentId;
	String studentName;
	
	This_AppliedOnInstanceVeriable(int studentId, String studentName){
		//this keyword applied on instance variable
		this.studentId = studentId;
		this.studentName = studentName;
	}
		
	public void display() {
		System.out.println(studentId + " " +studentName);
	}
}

class Tester {
	public static void main(String[] args) {
		This_AppliedOnInstanceVeriable sd = new This_AppliedOnInstanceVeriable(101, "Abi");
		sd.display();		
	}
}

