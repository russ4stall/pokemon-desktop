package com.teamrocket.pokemon;

import com.google.gson.Gson;
import com.teamrocket.pokemon.controls.NumberTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import pokemon.maker.PokemonData;
import pokemon.maker.fields.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static pokemon.maker.PokemonGeneratorApp.pp;

/**
 * @author Russ Forstall
 */
public class PokemonController implements Initializable {

    @FXML private ImageView spriteImg;
    @FXML private TextField nicknameField;
    @FXML private ComboBox<Species> speciesCmb;
    @FXML private NumberTextField currentHpField;
    @FXML private NumberTextField levelPcField;
    @FXML private ComboBox<StatusAilment> statusAilmentCmb;
    @FXML private ComboBox<Type> type1Cmb;
    @FXML private ComboBox<Type> type2Cmb;
    @FXML private ComboBox<Item> itemHeldCmb;
    @FXML private ComboBox<Move> move1Cmb;
    @FXML private ComboBox<Move> move2Cmb;
    @FXML private ComboBox<Move> move3Cmb;
    @FXML private ComboBox<Move> move4Cmb;



    // Populate all the dropdowns
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        speciesCmb.setItems(FXCollections.observableArrayList(Species.values()));
        speciesCmb.getSelectionModel().select(Species.Mew);
        statusAilmentCmb.setItems(FXCollections.observableArrayList(StatusAilment.values()));
        type1Cmb.setItems(FXCollections.observableArrayList(Type.values()));
        type2Cmb.setItems(FXCollections.observableArrayList(Type.values()));
        itemHeldCmb.setItems(FXCollections.observableArrayList(Item.values()));
        move1Cmb.setItems(FXCollections.observableArrayList(Move.values()));
        move2Cmb.setItems(FXCollections.observableArrayList(Move.values()));
        move3Cmb.setItems(FXCollections.observableArrayList(Move.values()));
        move4Cmb.setItems(FXCollections.observableArrayList(Move.values()));

    }

    public void createPokemon() {
        /*PokemonData pokemon = new PokemonData(
                speciesCmb.getSelectionModel().getSelectedItem().getName(),
                currentHpField.getNumber().intValue(),

        );*/

        final PokemonData data = new PokemonData(
                speciesCmb.getValue(),
                currentHpField.getNumber().intValue(),
                levelPcField.getNumber().intValue(),
                statusAilmentCmb.getValue(),
                type2Cmb.getValue(), // THIS IS IGNORED ONCE TRADE COMMENCES
                type1Cmb.getValue(), // THIS IS IGNORED ONCE TRADE COMMENCES
                itemHeldCmb.getValue(),
                move1Cmb.getValue(),
                move2Cmb.getValue(),
                move3Cmb.getValue(),
                move4Cmb.getValue(),
                1234,
                200000,
                65535,
                65535,
                65535,
                65535,
                65535,
                65535,
                pp(3, 0),
                pp(3, 0),
                pp(3, 0),
                pp(3, 0),
                74,
                300,
                150,
                151,
                152,
                153,
                nicknameField.getText(),
                "BOBBO");

        System.out.println(speciesCmb.getValue());
        System.out.println(data.getBytes().size());
        Gson gson = new Gson();
        System.out.println(gson.toJson(data));
        clearFields();
    }

    //Displays sprite of selected pokemon species
    public void onSelectSpecies() throws IOException {
        if (speciesCmb.getSelectionModel().getSelectedItem() != null) {
            String imgName = speciesCmb.getSelectionModel().getSelectedItem().toString();
            imgName = "images/sprites/" + imgName.toLowerCase() + ".png";
            Image sprite = new Image(imgName);
            spriteImg.setImage(sprite);
        }
    }

    public void clearFields() {

        spriteImg.setImage(new Image("images/sprites/mew.png"));
        nicknameField.clear();
        speciesCmb.getSelectionModel().select(Species.Mew);
        currentHpField.clear();
    }
}
