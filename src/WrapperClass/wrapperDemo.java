package WrapperClass;

public class wrapperDemo {
	public static void main(String[] args) {
		//Converting Wrapper class to primitive data Type
		int billNo = 2345;
		Integer num1 = Integer.valueOf(billNo);
		System.out.println(num1);
		
		double avg = 26.01;
		Double num2 = Double.valueOf(avg);
		System.out.println(num2);
		
		
		//Converting primitive data Type to wrapper class
		Integer num3 = Integer.valueOf(5698);
		Double num4  = Double.valueOf(30.56);
		int n1 = num3.intValue();
		double n2 = num4.doubleValue();
		System.out.println(n1);
		System.out.println(n2);
		
		//AutoBoxing -> Assigning Primitive data type value to wrapper class
		int n3 = 45;
		Integer num5 = n3;
		System.out.println(num5);
		
		//Unboxing -> Assigning Wrapper class value into Primitive data type
		Double d = Double.valueOf(59.23);
		double e = d;
		System.out.println(e);
		
		//Converting string to primitive data type
		
		String number  = "345";
		int newNumber = Integer.parseInt(number);
		System.out.println(newNumber);
		
	}
}
