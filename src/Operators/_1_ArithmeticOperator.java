package Operators;

public class _1_ArithmeticOperator {
	/*
	 * Types of Arithmetic operator - 
	 * ----------------------------
	 * 1. Addition (+)
	 * 2. Subtraction (-)
	 * 3. Multiplication (*)
	 * 4. Division (/)
	 * 5. Modulus (%)
	 */
	public static void main(String[] args) {
		int num1 = 15;
		int num2 = 4;
		
		//1. Addition 
		System.out.println("Addition of two numbers : "+(num1+num2));
		
		//2. Subtraction 
		System.out.println("Subtraction of two number : "+(num1-num2));
		
		//3. Multiplication
		System.out.println("Multiplication of two number : "+(num1*num2));
		
		//4. Division
		System.out.println("Division of two numbers : "+(num1/num2));
		
		//5. Modulus
		System.out.println("Reminder of two number after division : "+(num1%num2));
	}
}
