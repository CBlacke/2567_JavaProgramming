package lab_06;

public class Loan_test {

	public static void main(String[] args) {
		Loan_Calculater loan = new Loan_Calculater();
		
		loan.setLoanDetails("Laptop", 50000, 5, 2);
		
		loan.display();

	}

}
