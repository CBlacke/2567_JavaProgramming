import javax.swing.JOptionPane;
public class MusicWorldApp {

	public static void main(String[] args) {
		String cdId = JOptionPane.showInputDialog(null, "This progeam calculates the total cost of CD order Please enter the ID of he CD","Input",JOptionPane.QUESTION_MESSAGE);
		String cdTitle = JOptionPane.showInputDialog(null, "Plaese enter the title of the CD","Input",JOptionPane.QUESTION_MESSAGE);
		String Price = JOptionPane.showInputDialog(null, "Plaese enter the price of the CD in U.S> dollars","Input",JOptionPane.QUESTION_MESSAGE);
		String Quantity = JOptionPane.showInputDialog(null, "Plese enter the quantity to be purchased","Input",JOptionPane.QUESTION_MESSAGE);
		double cdPrice = Double.parseDouble(Price);
		double cdQuantity = Double.parseDouble(Quantity);
		double cdSubtotal = cdPrice * cdQuantity;
		double Tax_rate = 6.25/100;
		double cdTotal = cdSubtotal * (1+ Tax_rate);
		String message = "Summary of the transaction:\n"+"\nCD ID: "+cdId+"\nCD Title: "+cdTitle+"\nCD Unit Price:$"+cdPrice+"\nCD Quantity: "+cdQuantity+"\n"+"\nSubtotal:$"+cdSubtotal+"\nTax rate: "+Tax_rate* 100+"%"+"\nTotal:$"+cdTotal+"\n\nEnd of Program" ;
		JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.INFORMATION_MESSAGE);
	}

}
