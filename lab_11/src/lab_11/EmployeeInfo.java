package lab_11;

public class EmployeeInfo {

	private String dept;
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}
	public void header() {
		for(int i =1;i<60;i++)
			System.out.print("*");
		System.out.println();
	}

}
