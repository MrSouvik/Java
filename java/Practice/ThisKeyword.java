package Practice;

public class ThisKeyword {
	public String name;
	public ThisKeyword() {
		this("Souvik");
		System.out.println("This is default");
	}
	public ThisKeyword(String name) {
//		this();
		this.name = name;
		System.out.println("This is parameterised");
	}
	
	public void method1() {
		System.out.println("This is method1");
	}
	public void method2() {
		this.method1();
		System.out.println("This is method2");
	}
	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword();
		obj.method2();
	}
}
