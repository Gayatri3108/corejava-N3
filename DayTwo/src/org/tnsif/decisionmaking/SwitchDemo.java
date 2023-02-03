package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the song number");
		int songs=s.nextInt();
		switch(songs)
		{
		case 1:
			System.out.println("kesariya");
			break;
		case 2:
			System.out.println("ved");
			break;
		case 3:
			System.out.println("calm down");
			break;
		default:
			System.out.println("invalid input");
		}
	}

}
