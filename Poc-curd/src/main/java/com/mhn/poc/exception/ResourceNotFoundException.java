package com.mhn.poc.exception;

public class ResourceNotFoundException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException() {
		super("resourece not found on server");
	}
	
public ResourceNotFoundException(String msg) {
		super(msg);
	}
	
}
