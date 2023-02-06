package Encapsulationdemo;

import java.util.Scanner;

public class Encapsulation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the pin:");
		HDFC h=new HDFC();
		h.setPin(s.nextInt());
		System.out.println(h.getPin());
		h.accept();
	}

}
