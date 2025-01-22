package lab_06;

public class Product {

	private String name;
	private double price;
	private double vatRate;
	
	public void setProductDetails(String nameP, double priceP, double vatRateP) {
		name = nameP;
		price = priceP;
		vatRate = vatRateP;
	}
	public double calculateTotalPrice() {
		return price + (price * (vatRate/100.0));
	}
	public void display() {
		System.out.println("Product Name: " + name);
		System.out.println("Price (before VAT): " + price);
		System.out.println("Price (after VAT): " + calculateTotalPrice());		
	}
}
