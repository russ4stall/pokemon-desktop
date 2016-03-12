package com.teamrocket.pokemon;

/**
 * @author Russ Forstall
 */
public class PokemonTemp {
    private String nickname;
    private String species;
    private int currentHp;
    private int originalTrainerid;
    private String originalTrainerName;

    @Override
    public String toString() {
        return "PokemonTemp{" +
                "nickname='" + nickname + '\'' +
                ", species='" + species + '\'' +
                ", currentHp=" + currentHp +
                ", originalTrainerid=" + originalTrainerid +
                ", originalTrainerName='" + originalTrainerName + '\'' +
                '}';
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public int getOriginalTrainerid() {
        return originalTrainerid;
    }

    public void setOriginalTrainerid(int originalTrainerid) {
        this.originalTrainerid = originalTrainerid;
    }

    public String getOriginalTrainerName() {
        return originalTrainerName;
    }

    public void setOriginalTrainerName(String originalTrainerName) {
        this.originalTrainerName = originalTrainerName;
    }
}
