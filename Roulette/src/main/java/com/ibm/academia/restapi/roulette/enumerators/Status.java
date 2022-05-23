package com.ibm.academia.restapi.roulette.enumerators;

public enum Status {
	
    OPEN("Open"),
    CLOSED("Closed");

    public String status;

    Status ( String status ) {
        this.status = status;
    }

}
