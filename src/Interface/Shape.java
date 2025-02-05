package Interface;

public interface Shape {
	void draw();
	public default void fill(String colour) { //default
		System.out.println("Shape fill by colour : "+colour);
	}
}
