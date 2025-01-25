package Constructor;

public class Non_ParameterisedConstructor {
	String value ="data";
	Non_ParameterisedConstructor(){
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		Non_ParameterisedConstructor obj = new Non_ParameterisedConstructor(); //non parameterized constructor
	}
}
