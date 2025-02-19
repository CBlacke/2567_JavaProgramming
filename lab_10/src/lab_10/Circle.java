package lab_10;

public class Circle implements GeometricObject{

	protected double radius;
	Circle(double radius){
		this.radius = radius;
	}
	public String toString() {
		return "Circle[radius="+this.radius+"]";
	}
	@Override
	public double getParimeter() {
		return 2*Math.PI*this.radius;
	}
	@Override
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}
}
