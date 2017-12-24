package com.kubo.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
* Pickachu Class, They are overrated thanks to anime ¬¬
 */

public class Pikachu implements Pokemon{

    private static final Logger LOGGER = LoggerFactory.getLogger(Pikachu.class);

    @Override
    public void fight(){
        LOGGER.info("You choose Pikachu, Pikachu DO THUNDERBOLT! PIKACHUUUUUUUU!");
    }
}