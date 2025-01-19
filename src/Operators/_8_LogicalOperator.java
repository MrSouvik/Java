package Operators;

public class _8_LogicalOperator {
	/*
	 * Types of logical Operator - 
	 * --------------------------
	 * 1. Short Circuit AND or logical AND (&&)
	 * 2. Short Circuit OR or logical OR (||)
	 * 3. Logical NOT (!)
	 */
	public static void main(String[] args) {
		double balance = 2000;
		double amount = 500;
		double limit = 10000;
		double minBalance = 500;
		System.out.println("Example of Logical AND and NOT - ");
		//3. Logical NOT (!)
		if(!(amount< 0)) {
			//1. Short Circuit AND or logical AND (&&)
			if(amount<= limit && (balance - amount) > minBalance) {
				balance -= amount; 
				System.out.println("Success");
			}
		}
		else {
			System.out.println("Failed");
		}
		
		 balance = 600;
		 amount = 1500;
		
		//2. Short Circuit OR or logical OR (||)
		System.out.println("Example of Logical OR - ");
		if(amount<=0 || amount> balance) {
			System.out.println("Failed");
		}
		else {
			balance -= amount;
			System.out.println("Success");
		}
		
	}
}
