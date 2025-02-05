package Interface;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle draw sucessfully");
	}
	
	@Override
	public void fill(String colour) {
		System.out.println("Colour : "+colour+" fill inside Rectangle");
	}
}
