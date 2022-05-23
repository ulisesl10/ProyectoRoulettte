package com.ibm.academia.restapi.roulette.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.academia.restapi.roulette.domain.Bet;
import com.ibm.academia.restapi.roulette.domain.Roulette;
import com.ibm.academia.restapi.roulette.enumerators.Result;
import com.ibm.academia.restapi.roulette.mapper.RouletteMappers;
import com.ibm.academia.restapi.roulette.models.entities.RequestBetOnRoulette;
import com.ibm.academia.restapi.roulette.models.entities.Response;
import com.ibm.academia.restapi.roulette.models.entities.RouletteEntity;
import com.ibm.academia.restapi.roulette.repositories.RouletteRepository;

@RestController
@RequestMapping("/restapi")
public class RouletteController {
	
	private final RouletteRepository repository;

    RouletteController ( RouletteRepository repository ) {
        this.repository = repository;
    }

    @PostMapping("/createRoulette")
    public Response<Long> getId () {
        Response<Long> response = new Response<>();
        response.setData(new Roulette().createRoulette(repository).getId());
        return response;
    }

    @PostMapping("/openRoulette")
    public Response<String> openRoulette ( @RequestParam long id ) {
        new Roulette().openRoulette(repository, id);
        Response<String> response = new Response<>();
        response.setData(Result.Succeed.name() + id);
        return response;
    }


    @PostMapping("/betOnRoulette")
    public Response<String> betOnRoulette (
            @RequestBody RequestBetOnRoulette request,
            @RequestHeader long userId
    ) {
        return new Bet().betOnRoulette(repository, request);
    }

    @PostMapping("/closeRoulette")
    public Response<String> closeRoulette ( @RequestParam long id ) {
        return new Roulette().closeRoulette(repository, id);
    }

    @GetMapping("/getRoulettes")
    public Response<List<Roulette>> getRoulettes () {
        List<Roulette> rouletteList = new ArrayList<>();
        for (RouletteEntity rouletteEntity : repository.findAll()) {
            rouletteList.add(RouletteMappers.rouletteMapper(rouletteEntity));
        }
        Response<List<Roulette>> response = new Response<>();
        response.setData(rouletteList);
        return response;
    }

}
