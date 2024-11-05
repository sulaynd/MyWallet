package com.mywallet.exceptions;

import java.io.Serial;

public class BeneficiaryException extends Exception {

	/**
	 * 
	 */
	@Serial
	private static final long serialVersionUID = 1L;

	public BeneficiaryException() {
		super();
	}

	public BeneficiaryException(String message) {
		super(message);
	}

	
}
