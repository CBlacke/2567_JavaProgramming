package lab_06;
import java.util.*;
public class TestEmployeeInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		System.out.print("Enter details for Employee 1:\n");
		System.out.print("Name : ");
		String empName1 = scan.nextLine();
		System.out.print("Hours Woked : ");
		int emphourWoked1 = scan.nextInt();
		System.out.print("Hours Rate : ");
		double emphourRate1 = scan.nextDouble();
		
		emp1.setEmployeeDetails(empName1, emphourWoked1, emphourRate1);
		Line('-');
		System.out.println("\nEmployee 1 Details");
		emp1.display();
		Line('*');
		
		System.out.print("\nEnter details for Employee 2:\n");
		System.out.print("Name : ");
		String empName2 = scan.next();
		System.out.print("Hours Woked : ");
		int emphourWoked2 = scan.nextInt();
		System.out.print("Hours Rate : ");
		double emphourRate2 = scan.nextDouble();
		
		emp2.setEmployeeDetails(empName2, emphourWoked2, emphourRate2);
		Line('-');
		System.out.println("\nEmployee 2 Details");
		emp2.display();
		Line('*');
		scan.close();
	}
	
	public static void Line(char simbol) {
		for(int i=0;i<50;i++) {
			System.out.print(simbol);
		}
		//System.out.println();
	}

}
