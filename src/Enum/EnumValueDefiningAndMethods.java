package Enum;

enum sizeOfPizza{
	SMALL(20),MEDIUM(40),LARGE(30);
	
	private int noOfPizza;
	
	private sizeOfPizza(int noOfPizza) {
		this.noOfPizza = noOfPizza;
	}
	public int getNoOfPizza() {
		return noOfPizza;
	}
}

public class EnumValueDefiningAndMethods {
	public void avaliablity(sizeOfPizza p) {
		System.out.println(p.getNoOfPizza());
	}
	public static void main(String[] args) {
		EnumValueDefiningAndMethods p = new EnumValueDefiningAndMethods();
		p.avaliablity(sizeOfPizza.MEDIUM);
		
		for(sizeOfPizza s : sizeOfPizza.values()) {
			System.out.println("PizzaSize:" + s.name() + " Value:" + s.getNoOfPizza());
			System.out.println(s + " " + s.ordinal());
			System.out.println(s + " " + s.valueOf("SMALL"));
		}
	}
}
