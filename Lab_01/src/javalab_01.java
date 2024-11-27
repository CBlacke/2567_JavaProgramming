import java.util.*;
import java.text.*;
public class javalab_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		DecimalFormat nhd = new DecimalFormat("##");
		System.out.print("Input product Name\t: ");
		String productname = input.nextLine();
		System.out.print("Input product Unit\t: ");
		int productUnit = input.nextInt();
		System.out.print("Input Price per unit\t: ");
		float productPrice = input.nextFloat();
		float totalprice = productUnit*productPrice;
		System.out.print("------------------------------------\n");
		System.out.print("Total Price is "+frm.format(totalprice)+" baht.\n");
		System.out.print("------------------------------------\n");
		System.out.print("How many discount (%)\t: ");
		float discount = input.nextFloat();
		double fromdiscount = totalprice*discount/100;
		double Amount = totalprice - fromdiscount;
		System.out.print("Discount from "+nhd.format(discount)+"%"+"\t"+frm.format(fromdiscount)+" baht.\n");
		System.out.print("Amount to be paid\t"+frm.format(Amount)+" baht.");
		input.close();

	}

}
