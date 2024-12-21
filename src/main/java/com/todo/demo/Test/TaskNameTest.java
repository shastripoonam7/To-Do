package com.todo.demo.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.todo.demo.validation.StringValidation;


public class TaskNameTest {
	
	private final StringValidation strValid = new StringValidation();
	
	@Test
	void testTaskNamePresent() {
		
		assertTrue("Valid task name should pass",strValid.validatateString("Poonam Shastri"));
		
	}
	@Test
	void testInvalidCharacter() {
		assertFalse("String should not contain invalid characters",strValid.validatateString("Poonam@@@"));
	}
	@Test
	void voidEmptyString() {
		assertFalse("String should not be empty",strValid.validatateString(" "));
	}
}
