package com.ibm.academia.restapi.roulette.models.entities;

public class Response <T> {
    private T data;
    private String error = "No error :)";

    public T getData () {
        return data;
    }

    public void setData ( T data ) {
        this.data = data;
    }

    public String getError () {
        return error;
    }

    public void setError ( String error ) {
        this.error = error;
    }
}
