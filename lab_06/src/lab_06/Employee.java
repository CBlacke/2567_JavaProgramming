package lab_06;

public class Employee {

	private String name;
	private double hourWorked;
	private double  hourlyRate;
	
	public void setEmployeeDetails(String empname, double hours, double rate) {
		name = empname;
		hourlyRate = rate;
		hourWorked = hours;
	}
	public double calculateSalary() {
		double salary = hourWorked * hourlyRate;
		if(hourWorked > 40) {
			double bonus = salary * 0.10;
			salary += bonus;
			}
		return salary;
	}
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Hours Worked: "+ hourWorked);
		System.out.println("Hourly Rate: "+ hourlyRate);
		System.out.println("Total Salary: "+ calculateSalary());
	}

}
