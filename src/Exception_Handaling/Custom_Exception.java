package Exception_Handaling;

class MyMultiplyException extends Exception{
	public MyMultiplyException(String msg) {
		super(msg);
	}
}

public class Custom_Exception {
	public static void main(String[] args) {
		try {
			multiply(2,0);
		} catch (MyMultiplyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void multiply(int i, int j) throws MyMultiplyException {
		if(i==0 || j==0) {
			throw new MyMultiplyException("Number can not be Zero");
		}
		int mul = i*j;
		System.out.println("Answer : "+mul);
		
	}
}
