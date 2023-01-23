package day2;

public class main {
	public static void main(String[] args) {
		
		Square sq=new Square("Square",5);
		Rectangle rec=new Rectangle("Rectangle", 4,5);
		Circle cir=new Circle("Circle", 4);
		
		System.out.println(sq.calculateArea());

		System.out.println(rec.calculateArea());
		
		System.out.println(cir.calculateArea());
		
	}

}
