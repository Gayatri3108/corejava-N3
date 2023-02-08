package org.tnsif.superkeyword;

public class Rose extends Flower {
	private String name;
    //getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
     //default constructor
	public Rose() {
		System.out.println("rose");
	}
     //Parameterized constructor
	public Rose(String name) {
		super();
		this.name = name;
	}
    public void display() {    
    	System.out.println(name);
    	super.setName("Flower");
    } 
}

