import java.util.*;
import java.text.*;
public class JavaEx_01 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	DecimalFormat frm = new DecimalFormat("#,###.00");
	System.out.print("Input product name: ");
	String productname = input.nextLine();
	System.out.print("Input product unit: ");
	int productUnit = input.nextInt();
	System.out.print("Input price per unit: ");
	float productPrice = input.nextFloat();
	System.out.println();
	float totalPrice = productUnit * productPrice;
	System.out.println("Total Price is "+frm.format(totalPrice)+" baht.");
	float totalVAt = totalPrice + (totalPrice * 7/100);
	System.out.println("Add Vat 7% is "+frm.format(totalVAt)+" baht.");
	System.out.println();
	String frmtotalVAt = String.format("%,.2f", totalVAt);
	System.out.println("Output using String.format");
	System.out.println("Add Vat 7% is "+frmtotalVAt+" baht.");
	System.out.printf("Add VAT 7%% is %,.2f");

	
	input.close();
	}

}
