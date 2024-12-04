package lab_02;
import java.util.Random;
import javax.swing.*;

public class lab_withdrawal {

	public static void main(String[] args) {
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		int moneyWithdraw = Integer.parseInt(JOptionPane.showInputDialog("Your balance : "+balance+"\nInput money to withdraw: "));
		if (moneyWithdraw>balance) 
		{
			JOptionPane.showMessageDialog(null, "Error: can't withdraw", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		else if(moneyWithdraw>20000) 
		{
			JOptionPane.showMessageDialog(null, "Error: can't withdraw more than 20,000", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		else if(moneyWithdraw%100!=0) 
		{
			JOptionPane.showMessageDialog(null, "Error: can't withdraw "+ moneyWithdraw%100 + " baht." , "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "You withdraw "+ moneyWithdraw + " baht."+"\n1,000 = " +moneyWithdraw/1000+"\n500 = " +(moneyWithdraw%1000)/500+"\n100 = " +(moneyWithdraw%500)/100 );
		}
	}

}
