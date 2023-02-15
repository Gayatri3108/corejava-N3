package org.tnsif.customeexception;

import java.util.Scanner;
//driver class
//program to demonstrate on custom exception
public class CustomExceptionDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String id=s.nextLine();
		//s.nextLine();
		String password=s.nextLine();
        try {
        	if(id.equals("gayatrisu77@gmail.com")&& password.equals("abc@123"))
        	{
        		System.out.println("credentials matched");
        	}
        	else
        	{
        		throw new LoginCredential("invalid matched");
        	}
        }
        catch(LoginCredential e) {
        	System.out.println("exception handled "+e);
        }
        finally {
        	System.out.println("finally block");
        }
	}

}
