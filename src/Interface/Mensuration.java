package Interface;

public interface Mensuration {
	//java 7
	public static final int num =9; // by default variables are public static final
	void area(); //abstract method
	
	// java 8
	default void display() { //default method
		System.out.println("This is display method inside mensuration interface");
		get();
	}
	static void print() {
		System.out.println("This is static method inside mensuration interface");
		set();
		
	}
	
	//Java 9
	private void get() {
		System.out.println("This is private method inside interface");
	}
	private static void set() {
		System.out.println("This is private static method inside interface");
	}
}
