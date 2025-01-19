package Operators;

public class _3_Increment_DecrementOperator {
	/*
	 * Types of Increment Operator -
	 * ---------------------------
	 * 1. PreIncrement
	 * 2. PostIncrement
	 * 
	 * Types of Decrement Operator -
	 * ---------------------------
	 * 1. PreDecrement
	 * 2. PostDecrement
	 */
	public static void main(String[] args) {
		// PreIncrement
		int num = 10;
		System.out.println("After performing preIncrement value of num is : "+(++num)); //11
		
		//PostIncrement
		System.out.println("After performing postIncrement value of num is : "+(num++)); //11
		System.out.println("Current num value after all Increment : "+num); //12
		
		//PreDecrement
		System.out.println("After performing preDecrement value of num is : "+(--num)); //11
		
		//PostDecrement
		System.out.println("After performing postDecrement value of num is : "+(num--)); //11
		System.out.println("Current num value after all Decrement : "+num); //10
	}
}
