package org.tnsif.arraysdemo;

public class ArrayProgram {

	public static void main(String[] args) {
		//compile time input
		int arr[]= {11,31,54,67};
		int arr1[]=new int[5];
		arr1[0]=42;
		arr1[1]=45;
		arr1[2]=46;
		arr1[3]=47;
		arr1[4]=47;
		System.out.println(arr1[3]);
		System.out.println(arr[1]);
	}
}
