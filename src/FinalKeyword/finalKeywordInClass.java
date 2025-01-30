package FinalKeyword;

final public class finalKeywordInClass {
	int tenure = 10;
	double principal = 20000;
	float interest = 0.2f;
	
	public void calculateEMI() {
		System.out.println("The EMI is :" + tenure * principal * interest); 
	}
	
	public static void main(String[] args){
		finalKeywordInClass loan = new finalKeywordInClass();
		loan.calculateEMI();
	}
}
//uncomment the below code 
/*
class HomeLoan extends finalKeywordInClass{
	HomeLoan(){
		super.tenure = 20;
	}
	
	@Override
	public void calculateEMI() {
		System.out.println("The EMI is :" + tenure * principal * interest *2 );
	}
	
}*/
