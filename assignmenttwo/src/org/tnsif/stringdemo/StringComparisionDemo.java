package org.tnsif.stringdemo;

public class StringComparisionDemo {

	public static void main(String[] args) {
		//creating string using literal
		String s1="TNSIF";
		String s2="TNSIF";
		
		//CREATING STRING USING NEW OPERATOR
		String s3=new String("TNSIF");
		String s4=new String("TNSIF");
         
		//string comparison
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1.equals(s4));
		
		System.out.println(s1.compareTo("tnsif"));
		System.out.println(s1.compareToIgnoreCase("tnsif"));
		System.out.println(s1.compareTo(s2));
	}

}
