package com.spring.service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

public class UserService {
	
	public String passwordHashing(String password)
	{
		String myHash = "";
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(password.getBytes());
			byte[] digest = md.digest();
			myHash = DatatypeConverter.printHexBinary(digest).toUpperCase();
			System.out.println(myHash);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return myHash;
	}
	
	public boolean isValid(String email) {
	      String regex =  "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                "[a-zA-Z0-9_+&*-]+)*@" + 
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                "A-Z]{2,7}$";
	      if (email == null) { 
	            return false;
	      }
	      return email.matches(regex);
	   }

}
