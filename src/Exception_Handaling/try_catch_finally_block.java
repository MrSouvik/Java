package Exception_Handaling;

public class try_catch_finally_block {
	public static void main(String[] args) {
		int a = 9;
		int b = 0;
		float div = calculateDiv(a,b);
		System.out.println(div);
	}

	private static float calculateDiv(int a, int b) {
		float div = 0.0f;
		try {
			div = a/b;
		}
		catch (ArithmeticException e) {
			System.out.println("Message : "+e.getMessage());
			System.out.println("To String : "+e.toString());
			System.out.println("printing stract strace value : ");
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Exception");
		}
		finally {
			System.out.println("Finally code executed");
		}
		return div;
	}
}
