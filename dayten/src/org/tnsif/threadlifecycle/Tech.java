package org.tnsif.threadlifecycle;
//program to demonstrate on thread lifecycle
public class Tech extends Thread{
	 public void run() {
    	 System.out.println("java fullstack training");
    	 for(int i=1;i<=5;i++) {
    		 System.out.println(i+" ");
    	 }
    	 try {
    		 Thread.sleep(2000);
    	 }
    	 catch(InterruptedException e) {
    		 System.out.println(e);
    	 }
     System.out.print("technical session");
}
}