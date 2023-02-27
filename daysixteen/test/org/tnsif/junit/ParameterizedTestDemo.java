package org.tnsif.junit;
//program to demonstrate on parameterized test
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedTestDemo {

	@ParameterizedTest
	@ValueSource(strings={"Nia","diya"})
    void test() {
		System.out.println("hello");
	}
	
	@ParameterizedTest
	@ValueSource(strings={"Nia","dia"})
    void display(String str) {
		assertNotNull("nia"=="diya");
	}
}
