package org.tnsif.superkeyword;
//program to demonstrate super keyword in terms of variable
public class Flower {
     private String name;
    //getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
     //default constructor
	public Flower() {
		System.out.println("flower- parent class");
	}
     //parametirized constructor
	public Flower(String name) {
		super();
		this.name = name;
	}
     
}
