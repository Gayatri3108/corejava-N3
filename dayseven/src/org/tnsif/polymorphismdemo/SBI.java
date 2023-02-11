package org.tnsif.polymorphismdemo;
//child class
public class SBI extends RBI{
	float getInterest() {
		System.out.println(super.getInterest());
        return 12.8f;   
} 
}
