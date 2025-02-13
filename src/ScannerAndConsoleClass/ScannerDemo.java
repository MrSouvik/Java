package ScannerAndConsoleClass;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rollNo");
		int rollno = sc.nextInt();
		System.out.println("Enter the Name");
		String name = sc.next();
        sc.close();
        
        System.out.println("Name - "+name+"and Roll No "+rollno);
	}
}
