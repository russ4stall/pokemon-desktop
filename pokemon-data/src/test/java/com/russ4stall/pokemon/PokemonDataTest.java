package com.russ4stall.pokemon;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

/**
 * Created by russellf on 3/15/2016.
 */
public class PokemonDataTest {
    @Test
    public void testSerialization() throws Exception {

        PokemonData pokemon = new PokemonData();
        pokemon.setSpecies(Species.ARTICUNO);
        pokemon.setCurrentHp(300);
        pokemon.setLevelPc(74);
        pokemon.setStatusCondition(StatusCondition.NONE);
        pokemon.setType1(Type.BUG); // THIS IS IGNORED ONCE TRADE COMMENCES
        pokemon.setType2(Type.GHOST); // THIS IS IGNORED ONCE TRADE COMMENCES
        pokemon.setItemHeld(Item.BICYCLE);
        pokemon.setMove1(Move.BITE);
        pokemon.setMove2(Move.DRAGON_RAGE);
        pokemon.setMove3(Move.BUBBLE);
        pokemon.setMove4(Move.EARTHQUAKE);
        pokemon.setOriginalTrainerId(1234);
        pokemon.setExp(200000);
        pokemon.setHpEv(65535);
        pokemon.setAttackEv(65535);
        pokemon.setDefenseEv(65535);
        pokemon.setSpeedEv(65535);
        pokemon.setSpecialEv(65535);
        pokemon.setIv(65535);
        pokemon.setMove1pp(63);
        pokemon.setMove2pp(63);
        pokemon.setMove3pp(63);
        pokemon.setMove4pp(63);
        pokemon.setLevel(74);
        pokemon.setMaxHp(300);
        pokemon.setAttack(150);
        pokemon.setDefense(151);
        pokemon.setSpeed(152);
        pokemon.setSpecial(153);
        pokemon.setNickname("Alchemy");
        pokemon.setOriginalTrainerName("BOBBO");

        //int[] data = new int[] {0x15, 0x0, 0x64, 0x64, 0x00, 0x00, 0x00, 0x01, 0x01, 0x01, 0x01, 0x01, 0x4, 0xd2, 0x3, 0xd, 0x40, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0x3f, 0x3f, 0x3f, 0x3f, 0x4a, 0x1, 0x2c, 0x0, 0x96, 0x0, 0x97, 0x0, 0x98, 0x0, 0x99};
        List<String> dataBytes = pokemon.getBytes();

        dataBytes.stream().forEach(System.out::println);
        String[] arr = new String[dataBytes.size()];
        arr = dataBytes.toArray(arr);

        PokemonData pokemon2 = PokemonData.bytesToPokemon(arr);

        assertEquals(pokemon, pokemon2);
    }

    @Test
    public void testHexToSpecies() throws Exception {

        System.out.println(Integer.parseInt("12c", 16));
        Species rhydon = Species.valueOfHex("0x01");
        assertEquals(rhydon, Species.RHYDON);

        assertEquals(Species.valueOfHex("0x15"), Species.MEW);
        assertEquals(Species.valueOfHex("0xB4"), Species.CHARIZARD);
        assertEquals(Move.valueOfHex("0x89"), Move.GLARE);
        assertEquals(Type.valueOfHex("0x02"), Type.FLYING);
        assertEquals(Item.valueOfHex("0x06"), Item.BICYCLE);
    }
}
