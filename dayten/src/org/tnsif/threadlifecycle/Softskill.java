package org.tnsif.threadlifecycle;

public class Softskill extends Thread {
	 public void run() {
	System.out.println("professional ethics");
	 for(int i=1;i<=5;i++) {
		 System.out.println(i+" ");
	 }
   System.out.print("softskill session");
}
}
