package com.codeinvestigator.lombok_constructor_injection.spaceship;

import lombok.Value;

@Value
public class Message {
    private String content;
    private String receiver;
    private String sender;
}
