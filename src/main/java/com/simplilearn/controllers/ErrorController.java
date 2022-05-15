package com.simplilearn.controllers;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {

	/*@ExceptionHandler(value= Exception.class)
	public String arithmaticExceptionHandler() {
		return "Internal server error.";
	}*/

	@GetMapping("/calculate1")
	public Integer calculate() {
		int a = 6;
		int b = 0;
		int result = 6 / 0;
		return result;
	}
}
