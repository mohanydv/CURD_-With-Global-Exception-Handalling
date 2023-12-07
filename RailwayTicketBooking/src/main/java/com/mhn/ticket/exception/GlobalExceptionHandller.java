package com.mhn.ticket.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalExceptionHandller extends RuntimeException {

	
	@ExceptionHandler(InsuficientAmmountException.class)
	public ResponseEntity<ApiResponse> handelResourceNotFoundException(InsuficientAmmountException ex) {

		ApiResponse apiResponse = new ApiResponse(ex.getMessage(), true, HttpStatus.NOT_FOUND, new Date());

		return  new ResponseEntity<ApiResponse>(apiResponse,HttpStatus.NOT_FOUND);

	}
	
}
