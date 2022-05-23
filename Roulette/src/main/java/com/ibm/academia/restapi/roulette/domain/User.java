package com.ibm.academia.restapi.roulette.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.ibm.academia.restapi.roulette.models.entities.UserEntity;

public class User {
    private Long id;
    private int tokens;
    private String name;

    public Long getId () {
        return id;
    }

    public void setId ( Long id ) {
        this.id = id;
    }

    public int getTokens () {
        return tokens;
    }

    public void setTokens ( int tokens ) {
        this.tokens = tokens;
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public UserEntity createUser() {
        return new UserEntity();
    }
}
