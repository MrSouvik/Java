package AccessModifier_1;

public class AccessModifierClass2 {
	public static void main(String[] args) {
		AccessModifierExample p = new AccessModifierExample();
		p.name = "Souvik Santra"; // public modifier can be access another class
		System.out.println(p.name);
		
		//p.address = "Hyderabad"; // Private modifier can not be access another class 
		p.marks = 02; // default modifier can be access in another class within same package
		p.roll =11; //protected modifier can be access in another class within same package
		
	}
}
