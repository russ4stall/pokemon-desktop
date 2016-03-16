package com.teamrocket.pokemon;

import com.google.gson.Gson;
import com.russ4stall.pokemon.*;
import com.teamrocket.pokemon.controls.NumberSpinner;
import com.teamrocket.pokemon.controls.NumberTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import com.russ4stall.pokemon.PokemonData;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

//import static pokemon.maker.PokemonGeneratorApp.pp;

/**
 * @author Russ Forstall
 */
public class PokemonController implements Initializable {

    @FXML private ImageView spriteImg;
    @FXML private TextField nicknameField;
    @FXML private ComboBox<Species> speciesCmb;
    @FXML private NumberSpinner currentHpField;
    @FXML private NumberTextField levelPcField;
    @FXML private ComboBox<StatusCondition> statusConditionCmb;
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
        speciesCmb.getSelectionModel().select(Species.MEW);
        statusConditionCmb.setItems(FXCollections.observableArrayList(StatusCondition.values()));
        statusConditionCmb.getSelectionModel().select(StatusCondition.NONE);
        type1Cmb.setItems(FXCollections.observableArrayList(Type.values()));
        type1Cmb.getSelectionModel().select(Type.NORMAL);
        type2Cmb.setItems(FXCollections.observableArrayList(Type.values()));
        type2Cmb.getSelectionModel().select(Type.NORMAL);
        itemHeldCmb.setItems(FXCollections.observableArrayList(Item.values()));
        itemHeldCmb.getSelectionModel().select(Item.NO_ITEM);
        move1Cmb.setItems(FXCollections.observableArrayList(Move.values()));
        move1Cmb.getSelectionModel().select(Move.NOTHING);
        move2Cmb.setItems(FXCollections.observableArrayList(Move.values()));
        move2Cmb.getSelectionModel().select(Move.NOTHING);
        move3Cmb.setItems(FXCollections.observableArrayList(Move.values()));
        move3Cmb.getSelectionModel().select(Move.NOTHING);
        move4Cmb.setItems(FXCollections.observableArrayList(Move.values()));
        move4Cmb.getSelectionModel().select(Move.NOTHING);
    }

    public void createPokemon() {

        PokemonData data = new PokemonData();
        data.setSpecies(speciesCmb.getValue());
        data.setCurrentHp(currentHpField.getNumber().intValue());
        data.setLevelPc(levelPcField.getNumber().intValue());
        data.setStatusCondition(statusConditionCmb.getValue());
        data.setType1(type1Cmb.getValue()); // THIS IS IGNORED ONCE TRADE COMMENCES
        data.setType2(type2Cmb.getValue()); // THIS IS IGNORED ONCE TRADE COMMENCES
        data.setItemHeld(itemHeldCmb.getValue());
        data.setMove1(move1Cmb.getValue());
        data.setMove2(move2Cmb.getValue());
        data.setMove3(move3Cmb.getValue());
        data.setMove4(move4Cmb.getValue());
        data.setOriginalTrainerId(1234);
        data.setExp(200000);
        data.setHpEv(65535);
        data.setAttackEv(65535);
        data.setDefenseEv(65535);
        data.setSpeedEv(65535);
        data.setSpecialEv(65535);
        data.setIv(65535);
        data.setMove1pp(63);
        data.setMove2pp(63);
        data.setMove3pp(63);
        data.setMove4pp(63);
        data.setLevel(74);
        data.setMaxHp(300);
        data.setAttack(150);
        data.setDefense(151);
        data.setSpeed(152);
        data.setSpecial(153);
        data.setNickname(nicknameField.getText());
        data.setOriginalTrainerName("BOBBO");

        System.out.println(speciesCmb.getValue());
        System.out.println(data.getBytes().size());
        System.out.println(data.getBytes());
        Gson gson = new Gson();
        System.out.println(gson.toJson(data));
        //clearFields();
    }

    //Displays sprite of selected pokemon species
    public void onSelectSpecies() throws IOException {
        if (speciesCmb.getSelectionModel().getSelectedItem() != null) {
            String imgName = speciesCmb.getSelectionModel().getSelectedItem().name();
            imgName = imgName.replace("_", "");
            imgName = "images/sprites/" + imgName.toLowerCase() + ".png";
            Image sprite = new Image(imgName);
            spriteImg.setImage(sprite);
        }
    }

    public void clearFields() {

        spriteImg.setImage(new Image("images/sprites/mew.png"));
        nicknameField.clear();
        speciesCmb.getSelectionModel().select(Species.MEW);
        //currentHpField.clear();
    }
}
