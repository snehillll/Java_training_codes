package day3.product;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		AddingData data = new AddingData();

		ArrayList<Product> list = data.productData();
		
//		ArrayList<Product> list =new ArrayList<>();

		if (list.size() == 0) {
			throw new Exception("Cart Empty Exception");
		} else {
			for (Product st : list) {
				System.out.println("product's name: " + st.name);
				System.out.println("product ID " + st.id);
				System.out.println("Roll number: " + st.price);
			}
		}

	}
}
