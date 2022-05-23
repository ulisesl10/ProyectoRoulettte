package com.ibm.academia.restapi.roulette.enumerators;

public enum Result {
	
    Succeed("Succeed Open Roulette number "),
    Failed("Not Found Roulette number ");

    public String result;

    Result ( String result ) {
        this.result = result;
    }

}
