package Sealed_class_Interface;

sealed interface Employee1 permits PermanentEmployee1 {
	void displayEmployee();
}

final class PermanentEmployee1 implements Employee1{

	@Override
	public void displayEmployee() {
		System.out.println("Display Employee Details");
	}
}

public class SealedInterface {
	public static void main(String[] args) {

		PermanentEmployee1 pe = new PermanentEmployee1();
		pe.displayEmployee();

	}
}
