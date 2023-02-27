package org.tnsif.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//program to demonstrate on assertion annotation
class JunitAssertionDemo {

	@Test
	void test() {
		//fails when excepted
		assertEquals(12,12);
	}
    @Test
    void display() {
    	//fails when expression is true
    	assertFalse(12==1);
    }
    
}
