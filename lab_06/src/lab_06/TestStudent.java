package lab_06;

public class TestStudent {

	public static void main(String[] args) {
		Student st1 =new Student();
		Student st2 =new Student();
		
		st1.setStudentDetalis("c", new double[] {85,78,92});
		st2.setStudentDetalis("b", new double[] {68,100});
		
		System.out.println("Student 1 details:");
		st1.display();
		Line('-');
		System.out.println("\nStudent 2 details:");
		st2.display();
		Line('-');

	}
	
	public static void Line(char simbol) {
		for(int i=0;i<50;i++) {
			System.out.print(simbol);
		}
		System.out.println();
	}

}
