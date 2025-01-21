package AccessModifier_1;

public class AccessModifierExample {
	public String name; //This is public access modifier
	private String address; //This is private access modifier
	protected int roll; //This is Protected access modifier
	int marks; //this is default access modifier
	
	public static void main(String[] args) {
		AccessModifierExample p = new AccessModifierExample();
		p.name  = "Souvik Santra";
		System.out.println(p.name); //Public Access modifier can be access under same class
		p.address = "Hyderabad"; // private access modifier can be access under same class
		p.roll = 02; //protected access modifier can be access under same class
		p.marks = 84; //default access modifier can be access under same class
		System.out.println(p.address+" "+p.roll+" "+p.marks);
	}
}
