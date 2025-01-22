package lab_07;

public class Rectangle {

	private float lenght = 1.0f ;
	private float width = 1.0f ;
	
	Rectangle(){}
	Rectangle(float lenght, float width) {
		this.lenght  = lenght;

	}
	
	public float getLenght() {
		return this.lenght;
	}
	
	public void setLenght(float lenght) {
		this.lenght = lenght;
	}
	
	public float getWidth() {
		return this.width;
	}
	
	public void setWidth(float width) {
		this.width = width;
	}
	
	public double getArea() {
		return this.lenght * this.width;
	}
	public double getPerimeter() {
		return 2*(this.lenght+this.width);

	}
	public String showData() {
		return "Rectangle[lenght = "+ this.lenght + ", widht = "+ this.width+"]";
	}
	
	public String toString() {
		return "Rectangle[lenght = "+ this.lenght + ", widht = "+ this.width+"]";
	}
}
