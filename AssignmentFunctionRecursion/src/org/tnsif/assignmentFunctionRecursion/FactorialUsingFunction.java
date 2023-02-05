package org.tnsif.assignmentFunctionRecursion;

import java.util.Scanner;

//to demonstrate example on factorial of a number using fuction
public class FactorialUsingFunction {
	//function call
       static int factorial(int num)
       {
    	   int fact=1;
    	   for(int i=1;i<=num;i++)
    	   {
    		   fact=i*fact;
    	   }
    	   return fact;
       }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
         int num=s.nextInt();
         System.out.println("factorial of a givan number is:"+factorial(num));
          s.close();
	}

}
