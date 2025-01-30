package FinalKeyword;

public class finalKeywordInMethod {
	int tenure = 10;
	double principal = 20000;
	float interest = 0.2f;
	
	//final keyword on a method
	final public void calculateEMI() {
		System.out.println("The EMI is :" + tenure * principal * interest); 
	}
	
	public static void main(String[] args){
		finalKeywordInMethod loan = new finalKeywordInMethod();
		loan.calculateEMI();
	}
}
class HomeLoan1 extends finalKeywordInMethod{
    //Uncomment the below lines to see error if we try to invoke method defined with final
  
  /* @Override
	public void calculateEMI() {
		System.out.println("The EMI is :" + tenure * principal * interest *2 );
	}
	
  */
}