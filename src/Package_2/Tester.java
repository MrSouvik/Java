package Package_2;

import java.util.Scanner; //imported system defined package

import Package_1.Operations; //imported Operations class from package_1 (user defined package)


public class Tester {
	public static void main(String[] args) {
		Operations op = new Operations();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int num1 = sc.nextInt();
		System.out.print("\nEnter 2nd number : ");
		int num2 = sc.nextInt();
		System.out.println("Sum of two number : "+(num1+num2));
		
	}
}
