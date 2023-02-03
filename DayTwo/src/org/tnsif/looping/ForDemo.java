package org.tnsif.looping;

import java.util.Scanner;

// to demonstrate example of for loop
public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<n;i++)
		{
			System.out.println(i+" ");
		}
		
		for(int i=1;i>=n;i--)
		{
			System.out.println(i+" ");
		}
	}

}
