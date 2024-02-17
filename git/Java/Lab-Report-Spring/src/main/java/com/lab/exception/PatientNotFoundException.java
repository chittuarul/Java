package com.lab.exception;

@SuppressWarnings("serial")
public class PatientNotFoundException extends RuntimeException {

	public PatientNotFoundException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
	 public PatientNotFoundException(String message, Throwable cause) {
	        super(message, cause);
	    }
	
	

}
