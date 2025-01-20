package ConditionalStatement;

public class SwitchCase {
	public static void main(String[] args) {
		int choice = 2;
		
		switch(choice) {
		case 1: System.out.println("Entry Deposition");
		break;
		case 2: System.out.println("Display Operation");
		break;
		case 3: System.out.println("Deposit Operation");
		break;
		
		default:System.out.println("Invalid Choice");
		
		}
		int userChoice =2;
		
//		switch(userChoice) {
//		case 1,2 :System.out.println("Credit card");
//		break;
//		case 3,4 :System.out.println("Debit card");
//		break;
//		default:System.out.println("Wrong Choice");
//		}
		
//		String b = switch(userChoice) {
//		case 1,2 -> "credit card";
//		case 3,4 -> "Debit card";
//		default -> "Please enter a valid choice";
//		
//		};
//		System.out.println(b);
		
		String b = switch(userChoice) {
		case 1,2: yield "Credit Card";
		case 3,4: yield "Debit Card";
		default: yield "Invalid Choice";
		};
		
		System.out.println(b);
	}
}
