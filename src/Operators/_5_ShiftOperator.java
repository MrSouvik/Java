package Operators;

public class _5_ShiftOperator {
	/*
	 * Types of Shift Operators - 
	 * ------------------------
	 * 1. Shift left (<<)
	 * 2. Shift right (>>)
	 * 
	 * Shift Assignment Operator - 
	 * --------------------------
	 * 1. Shift left Assignment(<<=)
	 * 2. Shift right Assignment(>>=)
	 */
	
	public static void main(String[] args) {
		// 1. Shift left (<<)
		int num = 10; // 1010
		/*
		 *    1010
		 *   10100 1st shift
		 *  101000 2nd shift
		 */
		System.out.println("After performing shift left operator by two : "+(num<<2));
		
		//2. Shift right (>>)
		/*
		 *   1010
		 *   0101 1st shift
		 *   0010 2nd shift
		 */
		System.out.println("After performing shift right operator by two : "+(num>>2));
		
	}
}
