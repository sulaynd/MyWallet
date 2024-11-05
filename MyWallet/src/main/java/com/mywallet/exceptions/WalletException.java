package com.mywallet.exceptions;

import java.io.Serial;

public class WalletException extends Exception{

	/**
	 * 
	 */
	@Serial
	private static final long serialVersionUID = 1L;

	public WalletException() {
		super();
	}

	public WalletException(String message) {
		super(message);
	}

	
}
