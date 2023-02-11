package org.tnsif.polymorphismdemo;

import java.util.Scanner;

public class MethodOverloadingExcuter {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.print("enter the resolution and slottype");
		int resolution =s.nextInt();
		s.nextLine();
		String slotyype=s.nextLine();
		SmartPhone sp=new SmartPhone();
		sp.setResolution(resolution);
		sp.setSlotype(slotyype);
		sp.display(resolution);
		sp.display(resolution, slotyype);
		
		Multiplication m=new Multiplication();
		System.out.println(m.mul(11,5));
	    System.out.println(m.mul(5.2f,3));

	}

}
