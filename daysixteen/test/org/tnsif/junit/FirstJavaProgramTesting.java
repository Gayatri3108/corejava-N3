package org.tnsif.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//program to demonstrate on junit5 testing
class FirstJavaProgramTesting {

	@Test
	@DisplayName("simple junit testing method")
	void test() {
		//fail("Not yet implemented");
		System.out.println("first junit test case");
	}
	@Test
	void display() {
		System.out.println("welcome to junit5 testing");
	}

}
