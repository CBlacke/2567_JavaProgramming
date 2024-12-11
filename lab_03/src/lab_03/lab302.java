package lab_03;
import javax.swing.*;
public class lab302 {

	public static void main(String[] args) {
		String inputEmail = JOptionPane.showInputDialog("input your e-mail: ").toLowerCase();
		while(inputEmail.startsWith("@")||inputEmail.contains(" "))
		{
			inputEmail = JOptionPane.showInputDialog("input your e-mail, again: ").toLowerCase();
			
		}
		if(inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("hotmail.com"))
		{
			JOptionPane.showMessageDialog(null, "Your e-mail is "+ inputEmail);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail.com");
		}
	}

}
