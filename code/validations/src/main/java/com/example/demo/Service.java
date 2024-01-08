package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Service {

    public void post(Player player) {
        // no validations needed.
        log.info(" GOT HERE with inputObject {}", player);
    }


}
