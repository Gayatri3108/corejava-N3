package org.tnsif.finalkeyword;
//program to demonstrate final keyword with variable
public class FianlVariable {
	final static int x=15;
      public static void print() {
    	  //we cant change the value of x bcz x is final;
    	  //x=17;
    	  System.out.print("the value of x is:"+x);
      }
      public static void main(String args[]) {
    	  FianlVariable.print();
      }
}
