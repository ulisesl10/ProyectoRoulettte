package com.ibm.academia.restapi.roulette.mapper;

import com.ibm.academia.restapi.roulette.domain.Bet;
import com.ibm.academia.restapi.roulette.domain.Roulette;
import com.ibm.academia.restapi.roulette.domain.User;
import com.ibm.academia.restapi.roulette.models.entities.BetEntity;
import com.ibm.academia.restapi.roulette.models.entities.RouletteEntity;
import com.ibm.academia.restapi.roulette.models.entities.UserEntity;

public class RouletteMappers {

    public static Roulette rouletteMapper( RouletteEntity rouletteEntity) {
        Roulette roulette = new Roulette();
        roulette.setId(rouletteEntity.getId());
        roulette.setStatus(rouletteEntity.getStatus());
        return roulette;
    }

    public static Bet betMapper( BetEntity betEntity ) {
        Bet bet = new Bet();
        bet.setId(betEntity.getId());
        bet.setColor(betEntity.getColor());
        bet.setRoulette(rouletteMapper(betEntity.getRouletteEntity()));
        bet.setUser(userMapper(betEntity.getUserEntity()));
        bet.setBetAmount(betEntity.getBetAmount());
        bet.setBetNumber(betEntity.getBetNumber());

        return bet;
    }

    public static User userMapper( UserEntity userEntity ) {
        User user = new User();
        user.setId(userEntity.getId());
        user.setName(userEntity.getName());
        user.setTokens(userEntity.getTokens());
        return user;
    }
}
