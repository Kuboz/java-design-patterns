package com.kubo.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
* Ferraligatr Class, they are awesome!
*/

public class Ferraligatr implements Pokemon{

    private static final Logger LOGGER = LoggerFactory.getLogger(Ferraligatr.class);

    @Override
    public void fight(){
        LOGGER.info("You Choose Ferraligatr, Ferraligatr DO HYDRO PUMP!");
    }
}