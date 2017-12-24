package com.kubo.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App{

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main (String[] args){

        // A poke battle in GoF strategy
        LOGGER.info("A wild Charizard Appers");
        PokeMaster pokeMaster = new Pokemaster(new Ferraligatr());
        pokeMaster.goToBattle();
        LOGGER.info("A wild Blastoise Appers");
        pokeMaster.changePokemon(new Pikachu());
        pokeMaster.goToBattle();
        //Not a venosaur fan xD
        LOGGER.info("A wild Jigglepuff Apears");
        pokeMaster.changePokemon(new HitmonLee());
        pokeMaster.goToBattle();

        //A poke battle in Java 8 Strategy
        LOGGER.info("A wild Charizard Appers");
        pokeMaster = new PokeMaster(
            () -> LOGGER.info("You Choose Ferraligatr, Ferraligatr DO HYDRO PUMP!")
        );
        pokeMaster.goToBattle();

    }
}