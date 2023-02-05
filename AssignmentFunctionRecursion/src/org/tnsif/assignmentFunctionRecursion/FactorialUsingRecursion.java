package org.tnsif.assignmentFunctionRecursion;

import java.util.Scanner;

//example on factorial using recursion
public class FactorialUsingRecursion {
       static int factorial(int num)
       {
    	   if(num!=0)
    	   {
    		   return num*factorial(num-1);
    	   }
    	   return 1;
       }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
         int num=s.nextInt();
         System.out.println("factorial of a givan number is:"+factorial(num));
         s.close();
	}

}
