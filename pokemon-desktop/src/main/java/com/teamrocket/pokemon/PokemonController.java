package com.teamrocket.pokemon;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import pokemon.maker.PokemonData;
import pokemon.maker.fields.IntegerField;

/**
 * @author Russ Forstall
 */
public class PokemonController {

    @FXML private TextField nicknameField;
    @FXML private TextField speciesField;

    public void CreatePokemon() {
        PokemonData pokemonData = new PokemonData();
        pokemonData.setAttack(new IntegerField(12, 67));


    }
}
