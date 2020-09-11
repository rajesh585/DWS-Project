package com.db.awmd.challenge.exception;

import java.math.BigDecimal;

public class InsufficientBalanceException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientBalanceException(BigDecimal amount) {

	super(String.format("Insufficient balance to transfer amount,available balance is %.2f", amount));
    }
}
