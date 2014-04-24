package com.multivision.req.exception;

public class HibernateOperationFailedException extends Exception {
	private static final long serialVersionUID = 1L;
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HibernateOperationFailedException(String message) {
		this.message = message;
	}
}
