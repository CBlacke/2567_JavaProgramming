package lab_06;

public class Loan_Calculater {

	private String productName;
	private double price;
	private double interestRate;
	private int years;
	
	public void setLoanDetails(String NameP, double priceP, double interestRateP, int yearsP) {
		productName = NameP;
		price = priceP;
		interestRate = interestRateP;
		years = yearsP;
		
	}
	public double calculateMonthlyPayment() {
		int n = years * 12;
		double monthlyRate = interestRate/12/100;
		double payMent = (price*monthlyRate*Math.pow(1+monthlyRate, n))/(Math.pow(1+monthlyRate, n)-1);
		return payMent;
		
	}
	public void display() {
		System.out.println("Product Name: " + productName);
		System.out.println("Price : " + price);
		System.out.println("Interest Rate: "+ interestRate+"%" );		
		System.out.println("Loan period : " + years+"years");
		System.out.printf("Monthly Payment: %.2f", calculateMonthlyPayment());	
	}
}
