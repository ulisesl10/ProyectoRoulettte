package com.ibm.academia.restapi.roulette.models.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.ibm.academia.restapi.roulette.enumerators.Result;
import com.ibm.academia.restapi.roulette.enumerators.Status;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
public class RouletteEntity implements Serializable{
	
	
	@Id 
	@GeneratedValue 
	private Long id;
	
	private String status = Status.CLOSED.status;

//	public UserEntity user;

	public RouletteEntity () {}

	public Long getId() {
		return this.id;
	}

	public String getStatus () {
		return this.status;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setStatus ( String status ) {
		this.status = status;
	}

	public static class Response  {
		public String result = Result.Failed.result;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 8767975627546340645L;

}
