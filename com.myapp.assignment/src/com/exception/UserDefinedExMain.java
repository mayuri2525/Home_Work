package com.exception;

public class UserDefinedExMain { 
	public static void main(String[] args) throws InvalidCountryNameException {
		UserDefinedException uex=new UserDefinedException();
		uex.register();
	}

}
