package com.ibm.academia.restapi.roulette.models.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class UserEntity implements Serializable{
	
	
	@Id 
	@GeneratedValue
	private  Long id;
	
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

	/**
	 * 
	 */
	private static final long serialVersionUID = 344624747314059055L;

}
