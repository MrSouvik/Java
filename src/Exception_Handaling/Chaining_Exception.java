package Exception_Handaling;
class MyException extends Exception{
	public MyException(String msg) {
		super(msg);
	}
}

public class Chaining_Exception {
	public static void main(String[] args) {
		try {
			division(4,0);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Caugth : "+e);
			System.out.println("Actual : "+e.getCause());
		}
	}

	private static void division(int num, int divisor) throws Throwable {
		if(divisor==0) {
			throw new ArithmeticException("To layer divide by zero").initCause(new MyException("divide by zero"));
		}
		
	}
}
