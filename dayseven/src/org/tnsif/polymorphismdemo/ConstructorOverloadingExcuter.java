package org.tnsif.polymorphismdemo;

import java.util.Scanner;

public class ConstructorOverloadingExcuter {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//HondaCity c =new HondaCity();
		System.out.println("enter the speed and colorof"+"a hondacity");
         int speed =s.nextInt();
         s.nextLine();
         String color=s.nextLine();
         HondaCity c =new HondaCity();
         HondaCity c1 =new HondaCity(speed,color);
	}
}
