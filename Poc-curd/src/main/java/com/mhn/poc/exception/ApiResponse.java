package com.mhn.poc.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;

public class ApiResponse {

	private String message;
	private boolean sucess;
	private HttpStatus status;
	
	private Date timestap;
	
	public Date getTimestap() {
		return timestap;
	}
	public void setTimestap(Date timestap) {
		this.timestap = timestap;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isSucess() {
		return sucess;
	}
	public void setSucess(boolean sucess) {
		this.sucess = sucess;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public ApiResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ApiResponse(String message, boolean sucess, HttpStatus status) {
		super();
		this.message = message;
		this.sucess = sucess;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Apiresponse [message=" + message + ", sucess=" + sucess + ", status=" + status + ", timestap="
				+ timestap + "]";
	}
	public ApiResponse(String message, boolean sucess, HttpStatus status, Date timestap) {
		super();
		this.message = message;
		this.sucess = sucess;
		this.status = status;
		this.timestap = timestap;
	}

}
