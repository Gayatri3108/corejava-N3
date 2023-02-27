package org.tnsif.junit;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestInstance;
//import org.junit.jupiter.api.TestInstance.Lifecycle;
//@TestInstance(Lifecycle.PER_CLASS)
class JunitAnnotation {

	@Test
	@DisplayName("simple junit testing method")
	void test() {
		//fail("Not yet implemented");
		System.out.println("first junit test case");
	}
	@Test
	@BeforeAll
	  void display() {
		System.out.println("welcome to junit5 testing");
	}
	@Test
	@AfterEach
	@Disabled
	//if we make this method as static then we will not get method name
	//in testing
	//to overcome this we must have to use @TestInstance(Lifecycle.PER_CLASS)
	 void accept() {
		 System.out.println("after each method demo");
	 }
}
