package com.mywallet.exceptions;

import java.io.Serial;

public class LoginException extends Exception {

	/**
	 * 
	 */
	@Serial
	private static final long serialVersionUID = 1L;

	public LoginException() {
		super();
	}

	public LoginException(String message) {
		super(message);
	}
	
}
