package org.tnsif.instanceofdemo;
//to demonstrate the an example of instance of operator
//parent class
public class Person {
	//data memebers
    private String name;
    private String address;
    //getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	//default constructor
	public Person() {
		System.out.print("parent class");
	}
	//parameterized constructor
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
    
}
