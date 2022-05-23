package com.ibm.academia.restapi.roulette.exception.handler;

import com.ibm.academia.restapi.roulette.enumerators.Result;

public class RouletteNotFoundException extends RuntimeException {
	
	
	public RouletteNotFoundException ( Long id ) {
		super(Result.Failed.name() + id);
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 840523293321601595L;


}
