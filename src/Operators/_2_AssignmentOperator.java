package Operators;

public class _2_AssignmentOperator {
	/*
	 * Types of Assignment Operator - 
	 * ----------------------------
	 * 1. Assignment (=)
	 * 2. Addition Assignment (+=)
	 * 3. Subtraction Assignment (-=)
	 * 4. Multiplication Assignment (*=)
	 * 5. Division Assignment (/=)
	 */
	public static void main(String[] args) {
		//1. Assignment
		int num = 10;
		
		//2. Addition Assignment (+=)
		num+=1; //num = num +1
		System.out.println("Updated num value after performing Addition Assignment : "+num);
		
		//3. Subtraction Assignment (-=)
		num-=1; //num = num - 1
		System.out.println("Updated num value after performing Subtraction Assignment : "+num);
		
		//4. Multiplication Assignment (*=)
		num*=2; //num = num * 2
		System.out.println("Updated num value after performing Multiplication Assignment : "+num);
		
		//5. Division Assignment (/=)
		num*=2; //num = num / 2
		System.out.println("Updated num value after performing Division Assignment : "+num);
	}
}
