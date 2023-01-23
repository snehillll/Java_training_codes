package day3;

import java.util.Scanner;

public class AgeException {
	
	public static void validate(int age) {  
        if(age<19) {  
          
            throw new ArithmeticException("Invalid Age Exception");    
        }  
        else {  
            System.out.println("Person is eligible!");  
        }  
    }  
  
    public static void main(String args[]){
    	System.out.println("Enter Age: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        validate(a);  
        System.out.println("Hello.....");    
  }    

}
