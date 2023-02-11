package org.tnsif.polymorphismdemo;
//program to demonstrate on method oveloading
public class SmartPhone {
	//private data members
	private int resolution;
	private String Slotype;
	
	//method overloading in terms by passing nu of arguments
    void display(int resolution) {
    	System.out.print("camera resolutins"+resolution);
    	
    }    
	void display(int resolution,String slottype) {
		System.out.print("camera resolutins:"+resolution+"slottype is:"+slottype);
	}
	//getters and setters
	public int getResolution() {
		return resolution;
	}
	public void setResolution(int resolution) {
		this.resolution = resolution;
	}
	public String getSlotype() {
		return Slotype;
	}
	public void setSlotype(String slotype) {
		Slotype = slotype;
	}
	
}
