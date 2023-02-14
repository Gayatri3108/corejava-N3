package org.tnsif.exceptionhandligdemo;
import java.io.IOException;
//PROGRAM TO DEMONSTRATE ON THROW AND TROWS KEYWORD
public class ThrowKeywordDemo {
	//method definition 
     public static void donate(int age,int weight) throws Exception{
    	 if(age>18 && weight<50) {
    		 System.out.println("eligible to donate the blood");
    	 }
    	 else
    	 {
    		 //TO THROW AN EXPRESSION EXPLICITLY
    		 throw new IOException("not eligible");
    	 }
     }  	 
public static void main(String[] args) throws Exception {
		try{
			//method call
			donate(17,55);
		}
        catch(Exception e) {
        	System.out.println(e);
        }
	}

}
