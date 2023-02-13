package org.tnsif.arraysdemo;
import java.util.Arrays;
//program to demonstrate the array using user input
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the total no of elements "+" int the array");
		int n=s.nextInt();
		int arr[]=new int[n];
		//to allocate the value to an array
         /*for(int i=0;i<n;i++) {
        	 arr[i]=s.nextInt();
         }*/
         System.out.println("array elements are");
         //to print the elements in an array
         for(int i=0;i<n;i++) {
        	 System.out.println(arr[i]+" ");
         }
         //to sort an array elements
        /* Arrays.sort(arr);
        for(int i=0;i<n;i++) {
        	System.out.println(arr[i]+" ");
        }*/
         System.out.println("sorted elements are");
         for(int itr:arr) {
        	 System.out.println(itr+" ");
         }
	}

}
