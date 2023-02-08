package org.tnsif.instanceofdemo;
//this is my child class
public class Child extends Person {
       private int age;
      //getters and setters
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
     //default constructor
	public Child() {
		super();
		
	}
    //paramerized constrictor
	public Child(String name, String address,int age) {
		super(name, address);
		
	}

	@Override
	public String toString() {
		return "Child [age=" + age + ", getName()=" + getName() + ", getAddress()=" + getAddress() + "]";
	}
    
	 
}
