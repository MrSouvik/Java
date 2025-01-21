package AccessModifier_2;

import AccessModifier_1.AccessModifierExample;

public class AccessModifier_Example extends AccessModifierExample {
	public static void main(String[] args) {
		AccessModifierExample p = new AccessModifierExample();
		p.name = "Souvik Santra"; // public modifier can be access another package class
		System.out.println(p.name);
		
		//p.address = "Hyderabad"; // Private modifier can not be access another class 
		//p.marks = 02; // default modifier can not be access in another package
//		p.roll = 10;		
		
	}
}
