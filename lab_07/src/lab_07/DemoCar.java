package lab_07;

public class DemoCar {

	public static void main(String[] args) {
		Car car = new Car("Chevrolet", "Cruze",2009,150000.0);
		
		car.display();
		Spacing();
		System.out.println("Upadate Car Details:");
		car.setCompanyName("Toyota");
		car.setModelName("Corolla");
		car.setYear(2015);
		car.display();
		car.setYear(1870);
		car.setCompanyName(null);

	}
	public static void Spacing() {
		System.out.println();
	}

}
