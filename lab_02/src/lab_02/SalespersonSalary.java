package lab_02;
import java.util.*;

public class SalespersonSalary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double BASE_SALARY = 1000.0;
		final double COMMISSION_RATE = 0.15;
		final int SENTINEL = -1;
		 
		int sale;
		double salary;
		
		while(true)
		{
			System.out.print("Enter gross sales for the saleperson(or -1 to end): ");
			sale = input.nextInt();
			if (sale==SENTINEL)
			{
				break;
			}
			salary = BASE_SALARY+(sale * COMMISSION_RATE);
			System.out.printf("The saleperson's salary is : $%.2f%n",salary);
		}
		System.out.println("bye");
		input.close();
	}

}
