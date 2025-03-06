package Exception_Handaling;

public class throw_keyword {
	public static void main(String[] args) {
		divide(2,0);
	}

	private static void divide(int a, int b) {
		try {
			if(a==0) {
				throw new Exception("Opps! divider value can not be zero");
			}
			int div = a/b;
			System.out.println("Answer : "+div);
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Arithmetic Exception occurs");
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception occurs");
		}
		finally {
			System.out.println("Code sucessfully executed");
		}
		
	}
}
