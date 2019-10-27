package com.codeinvestigator.lombok_constructor_injection.spaceship;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class InitSpaceShips {

    private final SpaceShipRepository repository;

    @PostConstruct
    public void createSpaceShips(){
        repository.save(SpaceShip.builder().name("Round").crew(12).build());
        repository.save(SpaceShip.builder().name("Pyramid").crew(22).build());
        repository.save(SpaceShip.builder().name("Hexagon").crew(3).build());
        repository.save(SpaceShip.builder().name("Pentagon").crew(5).build());
        repository.save(SpaceShip.builder().name("Square").crew(11232).build());

    }
}
