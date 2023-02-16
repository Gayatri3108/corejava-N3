package org.tnsif.usingrunnable;
//driver class
//program to demonstrate on runnable interface for a thread
public class MarathonExcuter {

	public static void main(String[] args) {
		Marathon m=new Marathon();
		m.setSpeed(40);
		m.setCity("pune");
		m.run();

	}

}
