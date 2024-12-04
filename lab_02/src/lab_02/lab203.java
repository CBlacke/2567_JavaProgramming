package lab_02;

import javax.swing.JOptionPane;

public class lab203 {

	public static void main(String[] args) {
		double Weight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight:"));
		double Height = Double.parseDouble(JOptionPane.showInputDialog("Input height:"));
		double meter_H = Height/100;
		double bmi = Weight/(meter_H*meter_H);
		System.out.print(bmi);
		String meaning = " ";
		if(bmi>=30)
		{
			meaning = "Obesity";
		}
		else if (bmi>=25)
		{
			meaning = "Overweight";
		}
		else if (bmi>=18.5)
		{
			meaning = "Normal-weight";
		}
		else 
		{
			meaning = "Underweight";
		}
		JOptionPane.showMessageDialog(null, "BMI = "+bmi+"\nYou're "+meaning,"BMI",JOptionPane.WARNING_MESSAGE);
		
	}

}
