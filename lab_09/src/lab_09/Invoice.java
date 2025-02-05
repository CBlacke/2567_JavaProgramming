package lab_09;

public class Invoice {

	private int id;
	private Customer customer;
	private double amount;
	
	Invoice(int id, Customer customer, double amount){
		this.id = id;
		this.customer = customer;
		this.amount = amount;
	}

	public int getID() {
		return this.id;
	}	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getAmount() {
		return this.amount;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Customer getCustomer() {
		return this.customer ;
	}
	public int getCustomerID() {
		return getCustomer().getID() ;
	}
	public String getCustomerName() {
		return getCustomer().getName() ;
	}
	public int getCustomerDiscount() {
		return getCustomer().getDiscount() ;
	}
	public double getAmountAfterDiscount() {
		return this.getAmount() - (this.getAmount()-this.getCustomerDiscount()/100);
	}
	public String toString() {
		return "Invoice-[id="+this.getID()+",customer-"+customer+",amount="+
	this.getAmountAfterDiscount()+"]";
	}
 
}
