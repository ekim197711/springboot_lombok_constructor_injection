package com.codeinvestigator.lombok_constructor_injection.spaceship;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SpaceShipController {
    private final SpaceShipRepository spaceShipRepository;
    private final SpaceStationService spaceStationService;

    @GetMapping("/api/spaceship/")
    public Iterable<SpaceShip> spaceships(){
        Message m = new Message("Hello spacestation", "Captain", "Mike");

        spaceStationService.name();
        return spaceShipRepository.findAll();
    }
}
