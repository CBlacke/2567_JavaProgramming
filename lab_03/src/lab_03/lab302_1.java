package lab_03;

import javax.swing.JOptionPane;

public class lab302_1 {

	public static void main(String[] args) {
		/*String inputEmail = JOptionPane.showInputDialog("input your e-mail: ").toLowerCase();
		while(true)
		{
			if(inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("hotmail.com"))
			{
				JOptionPane.showMessageDialog(null, "Your e-mail is "+ inputEmail);
				break;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail.com");
			}
			inputEmail = JOptionPane.showInputDialog("input your e-mail, again: ").toLowerCase();
		}*/
		 boolean chEmail = false ;
		 String inputEmail;
		 while(true)
		 {
			 inputEmail = JOptionPane.showInputDialog("input your e-mail: ").toLowerCase();
			 while(inputEmail.startsWith("@")||inputEmail.contains(" "))
				{
					inputEmail = JOptionPane.showInputDialog("input your e-mail, again: ").toLowerCase();
					
				}			
		 }
	}

}
