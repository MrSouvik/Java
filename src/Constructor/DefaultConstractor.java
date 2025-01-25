package Constructor;

public class DefaultConstractor {
	String value = "data";
	public static void main(String[] args) {
		DefaultConstractor obj = new DefaultConstractor(); //default constructor will call
		System.out.println(obj.value);
	}
}
