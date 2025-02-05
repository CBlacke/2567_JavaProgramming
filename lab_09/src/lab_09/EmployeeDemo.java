package lab_09;
import java.util.*;

public class EmployeeDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input employee id     :");
		String empId = scan.next();
		scan.nextLine();
		System.out.print("Input employee name   :");
		String empName = scan.nextLine();
		System.out.print("Input employee salary :");
		double empSalary = scan.nextDouble();
		System.out.print("Input employee sales  :");
		double empSale = scan.nextDouble();
		System.out.println();
		
		Sales emp1 = new Sales(empId,empName,empSalary,empSale);
		System.out.println(emp1);
		System.out.printf("Total salary %.2f",emp1.getCommission()+emp1.getSalary());

	}

}
