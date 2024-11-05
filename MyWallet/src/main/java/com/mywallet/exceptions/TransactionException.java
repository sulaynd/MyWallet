package com.mywallet.exceptions;

import java.io.Serial;

public class TransactionException extends Exception{

	/**
	 * 
	 */
	@Serial
	private static final long serialVersionUID = 1L;

	public TransactionException() {
		super();
	}

	public TransactionException(String message) {
		super(message);
	}

	
}
