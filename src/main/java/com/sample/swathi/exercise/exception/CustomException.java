package com.sample.swathi.exercise.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomException extends RuntimeException {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomException.class);
	
	
	public CustomException(String msg) {
		
		//LOGGER.error(msg);
		System.out.println(msg);
	}
	
	public CustomException(Exception e) {
		
		LOGGER.error(e.getMessage());
		
	}
	
	public CustomException(Exception e, String msg) {
		
		LOGGER.error(e.getMessage(), msg);
		
	}
	

}
