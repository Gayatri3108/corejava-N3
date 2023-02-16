package org.tnsif.usingrunnable;
//interface Runnable{
	//void run();
	//void print();
//}
//program to demonstrate on runnable interface for a thread
public class Marathon implements Runnable {
    private int speed;
    private String city;
    //getters and setters
    public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	//runnable interface contains run() method by default
	@Override
	public void run() {
		System.out.println("speed of a participants:" +speed+"the city is:" +city);
		
	}
	void print() {
		
	}

}
