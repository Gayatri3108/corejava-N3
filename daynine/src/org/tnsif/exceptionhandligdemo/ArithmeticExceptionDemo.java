package org.tnsif.exceptionhandligdemo;
//program to demonstrate on arithmetic exception
import java.util.Scanner;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter the velue of x and y");
       int x=s.nextInt();
       int y=s.nextInt();
       //try blocks contains the exception code
       try {
              int res=x/y;
               System.out.println(res);
	        }
       //catch block handled the exception
       catch(Exception e) {
    	   System.out.println("exception handled using catch:"+e);
       }
       finally
       {
    	   System.out.println("finally block");
       }
	}
}	
