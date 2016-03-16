package com.russ4stall.pokemon;

/**
 * Created by russellf on 3/10/2016.
 */
public enum Type implements DataField {
    NORMAL("0x00", "Normal"),
    FIGHTING("0x01", "Fighting"),
    FLYING("0x02", "Flying"),
    POISON("0x03", "Poison"),
    GROUND("0x04", "Ground"),
    ROCK("0x05", "Rock"),
    BUG("0x07", "Bug"),
    GHOST("0x08", "Ghost"),
    FIRE("0x14", "Fire"),
    WATER("0x15", "Water"),
    GRASS("0x16", "Grass"),
    ELECTRIC("0x17", "Electric"),
    PSYCHIC("0x18", "Psychic"),
    ICE("0x19", "Ice"),
    DRAGON("0x1A", "Dragon");

    private final String hex;
    private final String name;

    Type(String hex, String name) {
        this.hex = hex;
        this.name = name;
    }

    public static Type valueOfHex(String hex) throws Exception {
        for (Type s : Type.values()) {
            if (s.hex.equals(hex)) {
                return s;
            }
        }
        throw new Exception("Cannot convert hex to type " + Type.class.getName());
    }

    @Override
    public String[] getHex() {
        return new String[] {hex};
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
