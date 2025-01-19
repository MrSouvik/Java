package ConditionalStatement;

public class IfElse_ElseIf {
	public static void main(String[] args) {
		double balance=600;
		double amount=500;
		
		if(amount<0) {
			System.out.println("Withdraw has failed as the amount is negative or zero");
		}
		
		else if(amount>balance) {
			System.out.println("Withdraw has failed as the amount is greater than balance");
		}
		else {
			balance=+amount;
			System.out.println("Withdraw has succeded");
		}
	}
}
