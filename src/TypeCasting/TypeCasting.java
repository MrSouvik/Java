package TypeCasting;

public class TypeCasting {
	public static void main(String[] args) {
		int i = 300;
		long l = i; //implicit type casting
		float f = l;
		
		int a = 5;
		int b = 2;
		float c= a/b;
		float d = (float)a/b; //Explicit type casting
		
		System.out.println("The respective values of int i, long l and float f are");
		System.out.println("i:"+i);
		System.out.println("l:"+l);
		System.out.println("f:"+f);
		
		System.out.println("The float value of implicit coversion is :"+c);
		System.out.println("The float value of explicit coversion is :"+d);
	}
}
