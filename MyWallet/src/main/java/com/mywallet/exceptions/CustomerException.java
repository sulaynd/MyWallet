package com.mywallet.exceptions;

import java.io.Serial;

public class CustomerException extends Exception{

	/**
	 * 
	 */
	@Serial
	private static final long serialVersionUID = 1L;

	public CustomerException() {
		super();
	}

	public CustomerException(String message) {
		super(message);
	}

	
}
