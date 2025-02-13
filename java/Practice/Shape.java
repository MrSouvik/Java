package Practice;



public class Shape { //This is class
	int shapeEdges; //class can hold 
	public void draw() {
		System.out.println("Shape draw succesfully. it has "+shapeEdges+" edges");
	}
	public static void main(String[] args) { //class holds methods - this is main method, execution start from here
		Shape square = new Shape(); //This is object created from Shape class
		square.shapeEdges = 4; // we can access class attributes using objects
		square.draw(); // We can call class methods using class object
		
		Shape circle = new Shape();
		circle.shapeEdges = 0;
		circle.draw();
	}
}
