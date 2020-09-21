package com.spring.utils;

public class EmailUtil {
	
	public static boolean isValid(String email) {
		String regex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";
		if (email == null) {
			return false;
		}
		return email.matches(regex);
	}


}
