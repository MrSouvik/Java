package Exception_Handaling;

public class throws_keyword_demo {
	public static void main(String[] args) {
		try {
			divide(3,0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void divide(int a, int b) throws Exception {
		if(a==0 || b==0) {
			throw new Exception("Can not use zero");
		}
		int div = a/b;
		System.out.println("Answer : "+div);
	}
}
