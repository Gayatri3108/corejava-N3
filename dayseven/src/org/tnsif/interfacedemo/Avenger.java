package org.tnsif.interfacedemo;
//implemented class
public class Avenger implements Bike {

	@Override
	public void milege(int speed) {
		// TODO Auto-generated method stub
		System.out.println("speed is:"+speed);
	}

	@Override
	public void engine() {
		System.out.println("working on petrol");
		
	}
           
}
