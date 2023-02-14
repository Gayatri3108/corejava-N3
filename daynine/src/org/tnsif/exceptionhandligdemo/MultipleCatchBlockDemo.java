package org.tnsif.exceptionhandligdemo;

import java.util.Scanner;
//program to demonstrate multiple catch block
public class MultipleCatchBlockDemo {  
			  
		    public static void main(String[] args) { 
		    	int arr[]=new int[] {11,22,33};
		    	Scanner s= new Scanner(System.in);
		    	
		    	System.out.println("enter the value of x and y");
		    	int x=s.nextInt();
		    	int y=s.nextInt();
		    	try {
		    		   int res=x/y;
		    		   System.out.println(res);
		    		   System.out.println(arr[3]);
		    		}
		    	/*catch(ArithmeticException e) {
		    		System.out.println(e);
		    	}
		    	catch(ArrayIndexOutOfBoundsException e){
		    		System.out.println(e);
		    	}*/
		    	catch(ArithmeticException | ArrayIndexOutOfBoundsException e ) {
		    		System.out.println("exception handled:");
		    		}
		    	}
		    }
		          
		         /*  try{    
		                int a[]=new int[5];    
		                a[5]=30/0;    
		               }    
		               catch(ArithmeticException e)  
		                  {  
		                   System.out.println("Arithmetic Exception occurs");  
		                  }    
		               catch(ArrayIndexOutOfBoundsException e)  
		                  {  
		                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
		                  }    
		               catch(Exception e)  
		                  {  
		                   System.out.println("Parent Exception occurs");  
		                  }             
		               System.out.println("rest of the code");    
		    }  
	}
*/