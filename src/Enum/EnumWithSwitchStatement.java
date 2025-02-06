package Enum;

enum pSize{
	SMALL,MEDIUM,LEARGE;
}

public class EnumWithSwitchStatement {
	public void checkOffer(pSize p) {
		switch(p) {
		case SMALL :
			System.out.println("10% off");
			break;
		case MEDIUM :
			System.out.println("20% off");
			break;
		case LEARGE :
			System.out.println("30% off");
			
		default:
			System.out.println("Pizza size is not exist");
			
		}
	}
	
	public static void main(String[] args) {
		EnumWithSwitchStatement e = new EnumWithSwitchStatement();
		e.checkOffer(pSize.MEDIUM);
	}
}
