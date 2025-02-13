package ScannerAndConsoleClass;

import java.io.Console;

public class ConsoleDemo {
	public static void main(String[] args) {
		String name = System.console().readLine();
		System.out.println("Name :" + name);
		
		Console console = System.console();
		System.out.println("Enter username");
		
		String user = console.readLine();
		System.out.println("Enter password");
		
		char ch[] = console.readPassword();
		String pwd = String.valueOf(ch);
		
		System.out.println("Username: " + user);
		System.out.println("Password: " + pwd);
	}
}
