package StringClass;

public class StringTest {
	public static void main(String[] args) {
		String s1 = "Infosys"; 
	    String s2 = "Infosys";

	    System.out.println(s1 == s2); //true - == checks value and address
	    System.out.println(s1.equals(s2)); //true - equals method only checks value

	    String s3 = "Limited";

	    System.out.println(s1 == s3); //false
	    System.out.println(s1.equals(s3)); //false

	    String s4 = new String("Infosys"); // new keyword every time generate new address of object

	    System.out.println(s1 == s4); //false
	    System.out.println(s1.equals(s4));//true

	    String s5 = new String("Infosys");

	    System.out.println(s1 == s5); //false
	    System.out.println(s1.equals(s5)); //true
	}
}
