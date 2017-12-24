package com.kubo.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
* HitmonLee Class, all based in the fucking bruce lee is valid
 */

public class HitmonLee implements Pokemon{

    private static final Logger LOGGER = LoggerFactory.getLogger(HitmonLee.class);

    @Override
    public void fight(){
        LOGGER.info("You Choose HitmonLee, HitmonLee DO SUPERPOWER!");
    }

}