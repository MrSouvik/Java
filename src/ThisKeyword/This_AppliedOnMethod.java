package ThisKeyword;

class This_method {
	void method1() {
		System.out.println("Inside Method 1");
	}

	void method2() {
		//this keyword applied on method
		this.method1();
		System.out.println("Inside Method 2");
	}
}

class This_AppliedOnMethod {

	public static void main(String[] args) {

		This_method sd = new This_method();
		sd.method2();
	}
}
