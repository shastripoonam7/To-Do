package com.todo.demo.validation;

import org.springframework.stereotype.Component;

@Component
public class StringValidation {
	
	public boolean validatateString(String str) {
		if(str.isEmpty() || str==null)
			return false;
		return str.matches("^[a-zA-Z\\s]+$"); // Only letters and spaces allowed
	}

}
