package day2;

public class Rectangle extends Shape{
	int l,b;
	
	Rectangle(String shapeName, int l, int b) {
		super(shapeName);
		this.l=l;
		this.b=b;
		// TODO Auto-generated constructor stub
	}
	public double calculateArea() {
		return l*b;
	}
}
