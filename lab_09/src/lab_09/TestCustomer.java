package lab_09;

public class TestCustomer {

	public static void main(String[] args) {
		System.out.println("###Test Customer class###");
		 Customer c1 = new Customer(1088, "Conan Edogawa", 10);
		 System.out.println(c1);
		 c1.setDiscount(5);
		 System.out.println(c1);
		 Line();
		 System.out.println(c1.getID());
		 System.out.println(c1.getName());
		 System.out.println(c1.getDiscount());
		 Line();
		 System.out.println("###Test Invoice class###");
		 Invoice inv1 = new Invoice(101, c1, 12000.00);
		 System.out.println(inv1);
		 inv1.setAmount(10000);
		 System.out.println(inv1);
		 
		 Line();
		 // show invoice's id
		 System.out.println(inv1.getID());
		 // Customer's toString() by instance inv1
		 
		 // show invoice's amount
		 System.out.println(inv1.getAmount());
		 Line();
		 // show customer's id by instance inv1
		 System.out.println("customer's id is:"+inv1.getCustomerID());
		 // show customer's name by instance inv1
		 System.out.println("customer's name is:"+inv1.getCustomerName());
		 // show customer's discount by instance inv1
		 System.out.print("customer's discount is:"+inv1.getCustomerDiscount());
		 // show invoice's amount after discount(format as output)
		 System.out.printf("amount after discount: %.2f", inv1.getAmountAfterDiscount());
		 } //end of main method()
		 public static void Line() {
		 for(int i = 0 ; i<=20;i++) {
			 System.out.print("*");
		 }
		 System.out.println();
	}

}
