package org.tnsif.exceptionhandligdemo;
//import java .io.*;
public class ArrayException {

	public static void main(String[] args) {
		System.out.println("first line");
		System.out.println("second line");
		try
		{
		int [] myIntArray=new int[] {1,2,3};
		print(myIntArray);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("the array doest have the fourth elements");
		}
		System.out.println("third line");
	}
    public static void print(int[] arr) {
    	System.out.println(arr[3]);
    }
       
}
