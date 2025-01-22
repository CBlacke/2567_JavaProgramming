package lab_06;

public class TestLoanCalculater {

	public static void main(String[] args) {
		LoanCalculater loan = new LoanCalculater();
		
		loan.setLoanDetails("Laptop", 50000, 5, 2);
		
		loan.display();

	}

}
