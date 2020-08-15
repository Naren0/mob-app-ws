package com.naren.app.ws.exceptions;

public class UserServiceException extends RuntimeException{
	
	
	private static final long serialVersionUID = 7890542098240870661L;

	public UserServiceException(String message) {
		super(message);
	}

}
