package com.russ4stall.pokemon;

/**
 * Created by russellf on 3/10/2016.
 */
public enum StatusCondition implements DataField {
   NONE("0x00", "None"),
   ASLEEP("0x04", "Asleep"),
   POISONED("0x08", "Poisoned"),
   BURNED("0x10", "Burned"),
   FROZEN("0x20", "Frozen"),
   PARALYZED("0x40", "Paralyzed");

    private final String hex;
    private final String name;

    StatusCondition(String hex, String name) {
        this.hex = hex;
        this.name = name;
    }

    public static StatusCondition valueOfHex(String hex) throws Exception {
        for (StatusCondition s : StatusCondition.values()) {
            if (s.hex.equals(hex)) {
                return s;
            }
        }
        throw new Exception("Cannot convert hex to type " + StatusCondition.class.getName());
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
