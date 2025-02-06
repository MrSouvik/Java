package Enum;

enum pizzaSize{
	SMALL,MEDIUM,LEARGE;
}
public class EnumCreation {
	public static void main(String[] args) {
		pizzaSize p = pizzaSize.MEDIUM;
		System.out.println(p);
	}
}
