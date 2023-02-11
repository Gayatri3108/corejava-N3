package org.tnsif.polymorphismdemo;
//program to demonstrate constructor overloading
public class HondaCity {
       public int speed;
       public String color;
       //getters and setters
	/*public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}*/
	//constructor overloading
	
	//constructor with no arguments
	public HondaCity() {
		System.out.println("Ilike to drive hondacity");
	}
	//constructor with arguments
	public HondaCity(int speed, String color) {
		super();
		this.speed = speed;
		this.color = color;
	}
       
}
