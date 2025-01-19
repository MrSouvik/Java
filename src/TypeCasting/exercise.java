package TypeCasting;

public class exercise {
	int billId;
	int customerID;
	int discount;
	double billAmount;
	public exercise(int billId, int customerID, int discount, double billAmount) {
		this.billId = billId;
		this.customerID = customerID;
		this.discount = discount;
		this.billAmount = billAmount;
	}
	
	public double getDiscountedBillAmount() {
		double discountedBillAmout = billAmount - (billAmount*((double)discount/100));
		return discountedBillAmout;
	}
	
	public static void main(String[] args) {
		exercise bill = new exercise(1001,101,2,199.99);
		System.out.println(bill.getDiscountedBillAmount());
		
	}
	
}
