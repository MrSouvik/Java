package Interface;

public class Square implements Shape,Mensuration {

	@Override
	public void area() {
		System.out.println("Squre area");
	}

	@Override
	public void draw() {
		System.out.println("Draw Squre");
	} 

}
