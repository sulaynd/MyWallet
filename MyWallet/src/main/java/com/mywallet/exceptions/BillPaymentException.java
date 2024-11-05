package com.mywallet.exceptions;

import java.io.Serial;

public class BillPaymentException extends Exception {

	/**
	 * 
	 */
	@Serial
	private static final long serialVersionUID = 1L;

	public BillPaymentException() {
		super();
	}

	public BillPaymentException(String message) {
		super(message);
	}

	
}
