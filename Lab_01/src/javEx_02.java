import javax.swing.*;
public class javEx_02 {

	public static void main(String[] args) {
		String priductName = JOptionPane.showInputDialog("Input Product Name: ");
		String strProductUnit = JOptionPane.showInputDialog("Input Product Unit: ");
		int productunit = Integer.parseInt(strProductUnit);
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog(""+"Inpt Product Price: "));
		double totalPrice = productunit * productPrice;
		double totalVAt = totalPrice + (totalPrice * 7/100);
		JOptionPane.showMessageDialog(null, "total price is "+totalPrice+"baht."+"\nAdd VAT is "+ totalVAt+"baht.");
		

	}

}
