package Operators;

public class _7_TernaryOperator {
	/*
	 * variable = (Condition)?(expression1):(expression2)
	 * if the condition is true then expression 1 will execute if false expression 2 will execute
	 */
	
	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int result = (a>b) ? a : b;
		System.out.println("Output : "+result);
	}
}
