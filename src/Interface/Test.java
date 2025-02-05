package Interface;

public class Test {
	public static void main(String[] args) {
		
		//Circle class Object
		Circle circle = new Circle();
		circle.area();
		
		
		//Rectangle class Object
		Rectangle rectangle = new Rectangle();
		rectangle.draw();
		rectangle.fill("Black");
		
		//Square Class Object
		Square square = new Square();
		square.area();
		square.draw();
		square.fill("Yellow");
		
		square.display(); // calling default method
		Mensuration.print(); // calling static method without using object
		
		
		
	}
}
