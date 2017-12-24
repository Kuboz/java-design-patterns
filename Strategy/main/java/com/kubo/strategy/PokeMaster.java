package com.kubo.strategy;

/*
* A pokemaster can choose different pokemons to be the best! ;D
*/
public class PokeMaster{

    public Pokemon pokemon;

    public PokeMaster(Pokemon pokemon){
        this.pokemon = pokemon;
    }

    public void changePokemon(Pokemon pokemon){
        this.pokemon = pokemon;
    }

    public void goToBattle(){
        pokemon.fight();
    }

}