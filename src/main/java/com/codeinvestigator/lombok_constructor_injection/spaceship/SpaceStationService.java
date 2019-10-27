package com.codeinvestigator.lombok_constructor_injection.spaceship;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SpaceStationService {
    public String name(){
        log.info("Huge spacestation");
        return "Huge spacestation";
    }
}
