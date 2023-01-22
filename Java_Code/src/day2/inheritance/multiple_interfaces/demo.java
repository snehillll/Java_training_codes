package day2.inheritance.multiple_interfaces;

class DemoClass implements FirstInterface, SecondInterface {
	public void myMethod() {
		System.out.println("Helllloooo");
	}

	public void myOtherMethod() {
		System.out.println("Heyyylluuuuuuuu");
	}
}

class demo {
	public static void main(String[] args) {
		DemoClass myObj = new DemoClass();
		myObj.myMethod();
		myObj.myOtherMethod();
	}
}
