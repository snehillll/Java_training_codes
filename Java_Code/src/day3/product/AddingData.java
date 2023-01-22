package day3.product;

import java.util.ArrayList;

public class AddingData 
{ 
   ArrayList<Product> productData()
   { 
	   
    Product s1 = new Product("Paper", 1234, 04); 
    Product s2 = new Product("Boat", 4321, 20 ); 
    Product s3 = new Product("Milk", 1212, 02); 

    ArrayList<Product> productlist = new ArrayList<Product>(); 
    
     productlist.add(s1); 
     productlist.add(s2); 
     productlist.add(s3); 

     return productlist; 
   } 
}