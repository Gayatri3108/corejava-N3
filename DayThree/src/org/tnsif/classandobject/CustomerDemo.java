package org.tnsif.classandobject;

import java.util.Scanner;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer c=new Customer(11,"gayatri","nashik");
        c.display();
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter id ,name and city");
		int id;
		String custname;
		String city;
		id=s.nextInt();
		s.nextLine();
		
		custname=s.nextLine();
	    city=s.nextLine();
		
		Customer c1=new Customer();
		c1.setId(id);
		c1.setCustname(custname);
		c1.setCity(city);
		
		System.out.println(c1.getId());
		System.out.println(c1.getCustname());
		System.out.println(c1.getCity());
	}

}
