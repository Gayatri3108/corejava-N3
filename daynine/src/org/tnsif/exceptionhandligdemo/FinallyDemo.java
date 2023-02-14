package org.tnsif.exceptionhandligdemo;
//program to demonstrate finally block is not executed
public class FinallyDemo {

	public static void main(String[] args) {
		
		//int arr[]=new int[] {101,23,45};
		try {
			int arr[]=new int[] {101,23,45};
			System.out.println("C2TC");
			//1.when it calls to system.exit(0);
			//System.exit(0);
			System.out.println(arr[3]);
			//System.exit(0);
		}
       catch(Exception e) {
    	   System.out.println("exception handled"+e);
    	  // System.exit(0);
       }
		finally {
			int res= 12/0;
			System.out.println();
			System.out.println("finally block");
		}
	}

}
