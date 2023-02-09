package org.tnsif.staticdemo;
//program to demonstrate on static method
public class StaticMethod {
	//data memebers
   private static double salary=45000.67;
   public static void display() {
	   System.out.print("salary is:"+salary);
   }
   //getetters and setters
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
   
}
