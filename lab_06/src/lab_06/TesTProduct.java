package lab_06;
import java.util.*;
public class TesTProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product product = new Product();
		
		System.out.print("Enter product name : ");
		String ProductName = scan.nextLine();
		System.out.print("Enter product price : ");
		double productPrice = scan.nextDouble();
		System.out.print("Enter VAT rate (%) : ");
		double VATrate = scan.nextDouble();
		
		product.setProductDetails(ProductName, productPrice, VATrate);
		
		System.out.println("Product Details: ");
		product.display();
		
		scan.close();
	}
}
