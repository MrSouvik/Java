package FinalKeyword;

public class finalKeywordInVariable {
	//final keyword on a variable
		final int tenure = 10;
		double principal = 20000;
		float interest = 0.2f;

		public static void main(String[] args){
			finalKeywordInVariable loan = new finalKeywordInVariable();
			System.out.println("Tenure is "+ loan.tenure +" Principal: "+loan.principal + " Interest rate is : "+ loan.interest);
		}
}
class HomeLoan extends finalKeywordInVariable{
	HomeLoan(){
		//Uncomment the below line to see the error
		//super.tenure = 20;
		
	}
}
