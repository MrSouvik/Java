package DataTypes;

public class _2_ScopeOfVariable {
	static int total = 100;
	int score = 87;
	public void totalMarks() {
		int marks = 90;
		System.out.println(total);
	}
	public static void main(String[] args) {
		int data = 50;
		_2_ScopeOfVariable sem = new _2_ScopeOfVariable();
		//System.out.println(score); // class level non static variable can't be access directly
		System.out.println(sem.score); //can be access by object
		//System.out.println(marks); //marks variable scope is under totalMarks method
		System.out.println(data); // data variable scope is under the main method
		System.out.println(total); // total is static & mention under class & can be access directly
	}
}
