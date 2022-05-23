package com.ibm.academia.restapi.roulette.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class RouletteNotFoundAdvice {

	@ResponseBody
	@ExceptionHandler(RouletteNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String rouletteNotFoundHandler( RouletteNotFoundException ex) {
		return ex.getMessage();
	}
}

