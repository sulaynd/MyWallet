package com.mywallet.exceptions;

import java.io.Serial;

public class BankAccountException extends Exception{

	/**
	 * 
	 */
	@Serial
	private static final long serialVersionUID = 1L;

	public BankAccountException() {
		super();
	}

	public BankAccountException(String message) {
		super(message);
	}

	
}
