package lab_10;

public class TestCircle {
	public static void main(String[] args) {
		Circle cl = new Circle(5.0);
		System.out.println(cl);
		String frmResult = String.format("%.2f", cl.getParimeter());
		System.out.println("Perimeter: "+frmResult); //ใช้ได้ท้งคู่
		System.out.printf("\nPerimeter: %.2f", cl.getArea());
	}
}
