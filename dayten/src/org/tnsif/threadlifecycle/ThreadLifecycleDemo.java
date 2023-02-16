package org.tnsif.threadlifecycle;

public class ThreadLifecycleDemo {

	public static void main(String[] args) {
		Tech t= new Tech();
		Softskill s= new Softskill();
		t.start();
		//move control to another thread
		t.yield();
		s.start();

	}

}
