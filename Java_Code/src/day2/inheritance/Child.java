package day2.inheritance;

public class Child extends Parent{
	int c;
	public void show() {
		c=20;
		System.out.println("In child show");
	}
	public void addition() {
		int sum = p+c;
		System.out.println("Sum: "+sum);
	}

}
