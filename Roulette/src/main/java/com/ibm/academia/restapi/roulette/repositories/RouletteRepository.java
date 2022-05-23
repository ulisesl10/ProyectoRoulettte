package com.ibm.academia.restapi.roulette.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.academia.restapi.roulette.models.entities.RouletteEntity;

public interface RouletteRepository extends JpaRepository<RouletteEntity, Long>{

}
