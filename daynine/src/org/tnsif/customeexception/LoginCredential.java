package org.tnsif.customeexception;
//program to demonstrate custom exception

public class LoginCredential extends Exception {
	//data members
       private String str;
     //parameterized constructor
	public LoginCredential(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "LohinCredential [str=" + str + "]";
	}
       
}
