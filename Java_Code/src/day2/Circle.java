package day2;

public class Circle extends Shape{
	
	int r;
	
	Circle(String shapeName, int r) {
		super(shapeName);
		this.r=r;
		// TODO Auto-generated constructor stub
	}
	
	public double calculateArea() {
		return (3.14*r*r);
	}
}
