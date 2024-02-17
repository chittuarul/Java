package com.lab.exception;

import org.springframework.http.HttpStatus;

public class PatientException {
	private final String message;
	private final Throwable throwable;
	private final HttpStatus httpStatus;
	public String getMessage() {
		return message;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public Throwable getThrowable() {
		return throwable;
	}
	
	public PatientException(String message, Throwable throwable, HttpStatus httpStatus) {
		super();
		this.message = message;		
		this.throwable = throwable;
		this.httpStatus = httpStatus;
	}
	
	
}
