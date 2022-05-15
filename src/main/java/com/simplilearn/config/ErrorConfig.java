package com.simplilearn.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ErrorConfig {

	@ExceptionHandler(value = ArithmeticException.class)
	@ResponseBody
	public String arithmaticExceptionHandler() {
		return "Internal server  error. Globally";
	}
}
