package day2;

public class Square extends Shape {
	public int side;

	Square(String shapeName, int side) {
		super(shapeName);
		this.side=side;
		// TODO Auto-generated constructor stub
	}
	
	public double calculateArea() {
		return side*side;	
	}
}
