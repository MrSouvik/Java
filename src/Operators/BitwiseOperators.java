package Operators;

public class BitwiseOperators {
	/*
	 * Types of Bitwise Operators - 
	 * --------------------------
	 * 1. Bitwise AND (&)
	 * 2. Bitwise OR (|)
	 * 3. Bitwise Exclusive OR (^)
	 * 4. Bitwise Unary NOT (~)
	 * 
	 * Bitwise Assignment Operators - 
	 * -----------------------------
	 * 1. Bitwise AND Assignment (&=)
	 * 2. Bitwise OR Assignment (|=)
	 * 3. Bitwise Exclusive OR Assignment (^=)
	 * 4. Bitwise Unary NOT Assignment (~=) 
	 */
	
	public static void main(String[] args) {
		int num1 = 2; // 0010 
		int num2 = 5; // 0101
		int num3 = 0; // 0000
		// AND =>     // 0000 = 0
		// OR  =>     // 0111 = 7
		// Ex-OR =>   // 0111 = 7
		// NOT of num1 => // 1101 = 13
		//1. Bitwise AND (&)
		System.out.println("After performing Bitwise AND of two number : "+(num1&num2));
		
		//2. Bitwise OR (|)
		System.out.println("After performing Bitwise OR of two number : "+(num1|num2));
		
		//3. Bitwise Exclusive OR (^)
		System.out.println("After performing Bitwise Exclusive OR of two number : "+(num1^num2));
		
		//4. Bitwise Unary NOT (~)
		System.out.println("After performing Bitwise NOT of num3 : "+(~num3));
	}
}
