package com.mhn.poc.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class globalExcetionHandller {
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handelResourceNotFoundException(ResourceNotFoundException ex) {

		ApiResponse apiResponse = new ApiResponse(ex.getMessage(), true, HttpStatus.NOT_FOUND, new Date());

		return  new ResponseEntity<ApiResponse>(apiResponse,HttpStatus.NOT_FOUND);

	}

}
