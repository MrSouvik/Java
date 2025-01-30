package Abstract;

abstract class Shape {
	public abstract void draw();
	public void fill(String color) {
		System.out.println("Fill in color:" + color);
	}
}

class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("Inside the Circle class draw method");
	}
}

class Square extends Shape{
	@Override
	public void draw() {
		System.out.println("Inside the Square class draw method");
	}
}
public class AbstractClass {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.draw();
		circle.fill("Red");
	}
}
