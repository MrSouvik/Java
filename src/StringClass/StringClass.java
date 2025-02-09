package StringClass;

import java.util.stream.Stream;

public class StringClass {
	public static void main(String[] args) {
		String s1 = "Infosys";
		String s2 = "Limited";

		System.out.println(s1.contains("Info")); //true

		System.out.println(s1.equalsIgnoreCase(s2)); //false

		System.out.println(s1.indexOf('f')); //2

		System.out.println(s1.substring(3)); //osys

		System.out.println(s1.substring(3, 5)); //os

		System.out.println(s1.replace('n', 'c')); //Icfosys
		
		//Part 2
		s1= "  Infosys  ";
		s2= "Limited";
		
		System.out.println(s1.trim()); //Infosys

		System.out.println(s2.length()); //7
		
		String car= "BMW Ford";
		String[] arr = car.split(" ");
		//for loop to print  
		for(String c:arr){  		
		System.out.println(c);  //BMW , Ford
		}
		
		//Java 11 feature 
		s1= "  Infosys  ";
		s2= "Limited";
		
		System.out.println(s2.repeat(2));
		
		System.out.println(s1.strip()); //Infosys
		System.out.println(s1.stripLeading()); //Infosys
		System.out.println(s1.stripTrailing());//    Infosys
		
		String s3= "A\nB\tC\n";
		Stream<String> lines= s3.lines();
		lines.forEach(System.out::println); // A B	C
		// is blank()
		System.out.println("Car".isBlank()); // false
		System.out.println("   Car   ".isBlank()); //false
		System.out.println("   ".isBlank()); //true
		System.out.println(" ".isBlank()); //true
		// isEmpty
		System.out.println("Car".isEmpty()); //false
		System.out.println("   ".isEmpty()); //false
		//concat method
		String name = "Percy";
		name.concat("Jackson");
		System.out.println(name); //Percy
	}
}
