package org.tnsif.exceptionhandligdemo;

import java.util.Scanner;

public class NestedTryCatchDemo {

	public static void main(String[] args) {
    	Scanner s= new Scanner(System.in);
    	System.out.println("enter the value of x and y");
    	int x=s.nextInt();
    	int y=s.nextInt();
    	int arr[]=new int[] {11,22,33};
    	try {
    		
    	     try {
    		      System.out.println(arr[3]);
    	         }
         	catch(ArrayIndexOutOfBoundsException e)
        	{
    		   System.out.println("exception handled"+e);
    	    }
    	     
    	    try {
    		   int res=x/y;
    		   System.out.println(res);
    	     }
    	    catch(ArithmeticException e) {
    		   System.out.println("exception handled"+e);
    	    }
    	}  
         finally
         {
        	 System.out.println("finally block");
         }
    	
}
}