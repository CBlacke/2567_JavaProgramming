package lab_02;
import javax.swing.JOptionPane;
import java.text.*;
public class lab201 {

	public static void main(String[] args) {
		final int BUFFET = 299;
		
		int customer = Integer.parseInt(JOptionPane.showInputDialog("how many customer per bill"));
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		double totalPrice = BUFFET * customer;
		String g = "hal";
		
		System.out.printf("Total price is %,.2f baht." , totalPrice);
		
		int isMember = JOptionPane.showConfirmDialog(null, "Total price is "+frm.format(totalPrice)+" baht."+ "\nDo you have a member card?");
		if (isMember == JOptionPane.YES_OPTION)
		{
			double Price_discount = totalPrice * 0.90;
			JOptionPane.showInternalMessageDialog(null, "Amount to paid is "+frm.format(Price_discount)+" baht.");
		}
		else if(isMember==JOptionPane.NO_OPTION) 
		{
			JOptionPane.showInternalMessageDialog(null, "Amount to paid is "+frm.format(totalPrice)+" baht.");
		}

	}

}
