package com.weekendfarm.exception;

/**
 * Simulated business-logic exception indicating a desired business entity or record cannot be found.
 */
public class UnknownResourceException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 8906079824421170582L;

	public UnknownResourceException(String msg) {
        super(msg);
    }
}
