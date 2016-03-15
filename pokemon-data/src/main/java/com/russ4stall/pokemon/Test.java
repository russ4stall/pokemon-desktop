package com.russ4stall.pokemon;

import static com.russ4stall.pokemon.Item.NO_ITEM;
import static com.russ4stall.pokemon.Move.*;
import static com.russ4stall.pokemon.Species.ABRA;
import static com.russ4stall.pokemon.StatusCondition.NONE;
import static com.russ4stall.pokemon.Type.PSYCHIC;

/**
 * Created by russellf on 3/10/2016.
 */
public class Test {
    static final int HP = 30;
    static final int LEVEL = 10;
    static final int OT_ID = 12345;
    static final String OT_NAME = "Russ";
    static final int EXP = 200000;
    static final int MAX_EV_STAT = 65535;
    static final int STAT = 150;
    static final int PP = 10;
    static final String NICKNAME = "TESTER";


    public static void main(String[] args) {

        PokemonData p = new PokemonData();
        p.setSpecies(ABRA);
        p.setCurrentHp(HP);
        p.setLevelPc(LEVEL);
        p.setStatusCondition(NONE);
        p.setType1(PSYCHIC);
        p.setType1(PSYCHIC);
        p.setItemHeld(NO_ITEM);
        p.setMove1(PSYCHIC_M);
        p.setMove2(AURORA_BEAM);
        p.setMove3(EARTHQUAKE);
        p.setMove4(REST);
        p.setOriginalTrainerId(OT_ID);
        p.setExp(EXP);
        p.setHpEv(MAX_EV_STAT);
        p.setAttackEv(MAX_EV_STAT);
        p.setHpEv(MAX_EV_STAT);
        p.setAttackEv(MAX_EV_STAT);
        p.setDefenseEv(MAX_EV_STAT);
        p.setSpeedEv(MAX_EV_STAT);
        p.setSpecialEv(MAX_EV_STAT);
        p.setIv(MAX_EV_STAT);
        p.setMove1pp(PP);
        p.setMove2pp(PP);
        p.setMove3pp(PP);
        p.setMove4pp(PP);
        p.setLevel(LEVEL);
        p.setMaxHp(HP);
        p.setAttack(STAT);
        p.setDefense(STAT);
        p.setSpeed(STAT);
        p.setSpecial(STAT);
        p.setNickname(NICKNAME);
        p.setOriginalTrainerName(OT_NAME);
    }
}
