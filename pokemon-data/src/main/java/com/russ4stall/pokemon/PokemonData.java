package com.russ4stall.pokemon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by russellf on 3/10/2016.
 */
public class PokemonData {
    private Species species;
    private IntegerField currentHp;
    private IntegerField levelPc;
    private StatusCondition statusCondition;
    private Type type1;
    private Type type2;
    private Item itemHeld;
    private Move move1;
    private Move move2;
    private Move move3;
    private Move move4;
    private IntegerField originalTrainerId;
    private IntegerField exp;
    private IntegerField hpEv;
    private IntegerField attackEv;
    private IntegerField defenseEv;
    private IntegerField speedEv;
    private IntegerField specialEv;
    private IntegerField iv;
    private IntegerField move1pp; //max 63 ?
    private IntegerField move2pp;
    private IntegerField move3pp;
    private IntegerField move4pp;
    private IntegerField level;  //max 255 ?
    private IntegerField maxHp;
    private IntegerField attack;
    private IntegerField defense;
    private IntegerField speed;
    private IntegerField special;

    private String nickname;
    private String originalTrainerName; //max 7 characters

    public PokemonData() {
    }

    public List<String> getTerminatedNickname() {
        //return pokemon.maker.TextConverter.padTo(pokemon.maker.TextConverter.terminate(pokemon.maker.TextConverter.convert(nickname)), "0x50", 11);
        return null;
    }

    public String getOriginalTrainerName() {
        return this.originalTrainerName;
    }

    public List<String> getBytes() {
        final List<String> bytes = new ArrayList<String>();
        bytes.addAll(Arrays.asList(species.getHex()));
        bytes.addAll(Arrays.asList(currentHp.getHex()));
        bytes.addAll(Arrays.asList(levelPc.getHex()));
        bytes.addAll(Arrays.asList(statusCondition.getHex()));
        bytes.addAll(Arrays.asList(type1.getHex()));
        bytes.addAll(Arrays.asList(type2.getHex()));
        bytes.addAll(Arrays.asList(itemHeld.getHex()));
        bytes.addAll(Arrays.asList(move1.getHex()));
        bytes.addAll(Arrays.asList(move2.getHex()));
        bytes.addAll(Arrays.asList(move3.getHex()));
        bytes.addAll(Arrays.asList(move4.getHex()));
        bytes.addAll(Arrays.asList(originalTrainerId.getHex()));
        bytes.addAll(Arrays.asList(exp.getHex()));
        bytes.addAll(Arrays.asList(hpEv.getHex()));
        bytes.addAll(Arrays.asList(attackEv.getHex()));
        bytes.addAll(Arrays.asList(defenseEv.getHex()));
        bytes.addAll(Arrays.asList(speedEv.getHex()));
        bytes.addAll(Arrays.asList(specialEv.getHex()));
        bytes.addAll(Arrays.asList(iv.getHex()));
        bytes.addAll(Arrays.asList(move1pp.getHex()));
        bytes.addAll(Arrays.asList(move2pp.getHex()));
        bytes.addAll(Arrays.asList(move3pp.getHex()));
        bytes.addAll(Arrays.asList(move4pp.getHex()));
        bytes.addAll(Arrays.asList(level.getHex()));
        bytes.addAll(Arrays.asList(maxHp.getHex()));
        bytes.addAll(Arrays.asList(attack.getHex()));
        bytes.addAll(Arrays.asList(defense.getHex()));
        bytes.addAll(Arrays.asList(speed.getHex()));
        bytes.addAll(Arrays.asList(special.getHex()));
        return Collections.unmodifiableList(bytes);
    }

    public static PokemonData bytesToPokemon(String[] bytes) throws Exception {
        PokemonData data = new PokemonData();
        data.setSpecies(Species.valueOfHex(bytes[0]));
        data.setCurrentHp(hexToInt(bytes[1], bytes[2]));
        data.setLevelPc(hexToInt(bytes[3]));
        data.setStatusCondition(StatusCondition.valueOfHex(bytes[4]));
        data.setType1(Type.valueOfHex(bytes[5])); // THIS IS IGNORED ONCE TRADE COMMENCES
        data.setType2(Type.valueOfHex(bytes[6])); // THIS IS IGNORED ONCE TRADE COMMENCES
        data.setItemHeld(Item.valueOfHex(bytes[7]));
        data.setMove1(Move.valueOfHex(bytes[8]));
        data.setMove2(Move.valueOfHex(bytes[9]));
        data.setMove3(Move.valueOfHex(bytes[10]));
        data.setMove4(Move.valueOfHex(bytes[11]));
        data.setOriginalTrainerId(hexToInt(bytes[12], bytes[13]));
        data.setExp(hexToInt(bytes[14], bytes[15], bytes[16]));
        data.setHpEv(hexToInt(bytes[17], bytes[18]));
        data.setAttackEv(hexToInt(bytes[19], bytes[20]));
        data.setDefenseEv(hexToInt(bytes[21], bytes[22]));
        data.setSpeedEv(hexToInt(bytes[23], bytes[24]));
        data.setSpecialEv(hexToInt(bytes[25], bytes[26]));
        data.setIv(hexToInt(bytes[27], bytes[28]));
        data.setMove1pp(hexToInt(bytes[29]));
        data.setMove2pp(hexToInt(bytes[30]));
        data.setMove3pp(hexToInt(bytes[31]));
        data.setMove4pp(hexToInt(bytes[32]));
        data.setLevel(hexToInt(bytes[33]));
        data.setMaxHp(hexToInt(bytes[34], bytes[35]));
        data.setAttack(hexToInt(bytes[36], bytes[37]));
        data.setDefense(hexToInt(bytes[38], bytes[39]));
        data.setSpeed(hexToInt(bytes[40], bytes[41]));
        data.setSpecial(hexToInt(bytes[42], bytes[43]));
        return data;
    }

    private static int hexToInt(String... args) {
        if (args.length == 1) {
            return Integer.parseInt(args[0].substring(2), 16);
        } else if (args.length == 2) {
            int b2 = Integer.parseInt(args[1].substring(2), 16);
            int b1 = Integer.parseInt(args[0].substring(2), 16);
            return ((b1 & 0xFF) << 8) | (b2 & 0xFF);
        } else {
            int b3 = Integer.parseInt(args[2].substring(2), 16);
            int b2 = Integer.parseInt(args[1].substring(2), 16);
            int b1 = Integer.parseInt(args[0].substring(2), 16);
            return ((b1 & 0xF) << 16) | ((b2 & 0xFF) << 8) | (b3 & 0xFF);
        }
    }

    public void setNickname(String nickname) {
        if (nickname.length() > 10) {
            throw new IllegalArgumentException("Nickname cannot be more than 10 characters long");
        }
        this.nickname = nickname;
    }

    public void setOriginalTrainerName(String originalTrainerName) {
        if (originalTrainerName.length() > 7) {
            throw new IllegalArgumentException("Original trainer name cannot be more than 7 characters long");
        }
        this.originalTrainerName = originalTrainerName;
    }

    @Override
    public String toString() {
        return "PokemonData{" +
                "species=" + species +
                ", currentHp=" + currentHp +
                ", levelPc=" + levelPc +
                ", statusCondition=" + statusCondition +
                ", type1=" + type1 +
                ", type2=" + type2 +
                ", itemHeld=" + itemHeld +
                ", move1=" + move1 +
                ", move2=" + move2 +
                ", move3=" + move3 +
                ", move4=" + move4 +
                ", originalTrainerId=" + originalTrainerId +
                ", exp=" + exp +
                ", hpEv=" + hpEv +
                ", attackEv=" + attackEv +
                ", defenseEv=" + defenseEv +
                ", speedEv=" + speedEv +
                ", specialEv=" + specialEv +
                ", iv=" + iv +
                ", move1pp=" + move1pp +
                ", move2pp=" + move2pp +
                ", move3pp=" + move3pp +
                ", move4pp=" + move4pp +
                ", level=" + level +
                ", maxHp=" + maxHp +
                ", attack=" + attack +
                ", defense=" + defense +
                ", speed=" + speed +
                ", special=" + special +
                ", nickname='" + nickname + '\'' +
                ", originalTrainerName='" + originalTrainerName + '\'' +
                '}';
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = new IntegerField(currentHp, 2);
    }

    public void setLevelPc(int levelPc) {
        this.levelPc = new IntegerField(levelPc, 1);
    }

    public void setStatusCondition(StatusCondition statusCondition) {
        this.statusCondition = statusCondition;
    }

    public void setType1(Type type1) {
        this.type1 = type1;
    }

    public void setType2(Type type2) {
        this.type2 = type2;
    }

    public void setItemHeld(Item itemHeld) {
        this.itemHeld = itemHeld;
    }

    public void setMove1(Move move1) {
        this.move1 = move1;
    }

    public void setMove2(Move move2) {
        this.move2 = move2;
    }

    public void setMove3(Move move3) {
        this.move3 = move3;
    }

    public void setMove4(Move move4) {
        this.move4 = move4;
    }

    public void setOriginalTrainerId(int originalTrainerId) {
        this.originalTrainerId = new IntegerField(originalTrainerId, 2);
    }

    public void setExp(int exp) {
        this.exp = new IntegerField(exp, 3);
    }

    public void setHpEv(int hpEv) {
        this.hpEv = new IntegerField(hpEv, 2);
    }

    public void setAttackEv(int attackEv) {
        this.attackEv = new IntegerField(attackEv, 2);
    }

    public void setDefenseEv(int defenseEv) {
        this.defenseEv = new IntegerField(defenseEv, 2);
    }

    public void setSpeedEv(int speedEv) {
        this.speedEv = new IntegerField(speedEv, 2);
    }

    public void setSpecialEv(int specialEv) {
        this.specialEv = new IntegerField(specialEv, 2);
    }

    public void setIv(int iv) {
        this.iv = new IntegerField(iv, 2);
    }

    public void setMove1pp(int move1pp) {
        if (move1pp > 63) {
            throw new IllegalArgumentException("Move PP cannot be over 63.");
        }
        this.move1pp = new IntegerField(move1pp, 1);
    }

    public void setMove2pp(int move2pp) {
        if (move2pp > 63) {
            throw new IllegalArgumentException("Move PP cannot be over 63.");
        }
        this.move2pp = new IntegerField(move2pp, 1);
    }

    public void setMove3pp(int move3pp) {
        if (move3pp > 63) {
            throw new IllegalArgumentException("Move PP cannot be over 63.");
        }
        this.move3pp = new IntegerField(move3pp, 1);
    }

    public void setMove4pp(int move4pp) {
        if (move4pp > 63) {
            throw new IllegalArgumentException("Move PP cannot be over 63.");
        }
        this.move4pp = new IntegerField(move4pp, 1);
    }

    public void setLevel(int level) {
        this.level = new IntegerField(level, 1);
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = new IntegerField(maxHp, 2);
    }

    public void setAttack(int attack) {
        this.attack = new IntegerField(attack, 2);
    }

    public void setDefense(int defense) {
        this.defense = new IntegerField(defense, 2);
    }

    public void setSpeed(int speed) {
        this.speed = new IntegerField(speed, 2);
    }

    public void setSpecial(int special) {
        this.special = new IntegerField(special, 2);
    }
}
