package StringBuilder;

public class TextBlockdemo {
	//JAVA 15 feature
	public static void main(String[] args) {
		System.out.println("\"Welcome to\"\nNew Features\nof Java");
		// Simplified using Text blocks
		System.out.println("""
				"Welcome to"
				New Features
				of Java
				""");
		// with string \ used if we want to print in the same line
		String names = """
				Riya \
				Diya
				Siya""";
		System.out.println(names);
		// Uncomment and see the below code will give compilation error
		// Should not be in the same line string literal is not closed
		/*
		 * String names1 = """Riya Diya Siya""";
		   System.out.println(names1);
		 */
		String books = """
				"Java"
					Hibernate
					SpringBasics
				Scala
				  RestAPIs""";
		System.out.println(books);
		String course = """
				Java: %s
				Hibernate: %s
				SpringBasics
				Scala Programming
				Rest API
				""".formatted("Core Java", "Framework");
		System.out.println(course);
	}
	
}
