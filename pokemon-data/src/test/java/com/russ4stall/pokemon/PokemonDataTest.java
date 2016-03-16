package com.russ4stall.pokemon;

import org.junit.Test;

import javax.xml.bind.DatatypeConverter;
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

        List<String> dataBytes = pokemon.getBytes();

        String[] arr = new String[dataBytes.size()];
        arr = dataBytes.toArray(arr);

        PokemonData pokemon2 = PokemonData.bytesToPokemon(arr);

        //assertEquals(pokemon, pokemon2);
        assertEquals(pokemon.getBytes(), pokemon2.getBytes());

        System.out.println(pokemon);
        System.out.println(pokemon2);
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

    @Test
    public void byteTests() {
        int in = 500;
        byte[] data = new byte[2]; // <- assuming "in" value in 0..65535 range and we can use 2 bytes only

        data[0] = (byte)(in & 0xFF);
        data[1] = (byte)((in >> 8) & 0xFF);

        int value = 65535;
        int bytes = 2;

        final String lowByte = "0x" + Integer.toString(value & 0xFF, 16);
        final String highByte = "0x" + Integer.toString((value >> 8) & 0xFF, 16);
        final String higherByte = "0x" + Integer.toString((value >> 16) & 0xFF, 16);

        String[] ss;

        if(bytes == 3) {
            ss = new String[] {higherByte, highByte, lowByte};
        } else if(bytes == 2) {
            ss = new String[] {highByte, lowByte};
        } else {
            ss = new String[] {lowByte};
        }

        //int b3 = Integer.parseInt(ss[2].substring(2), 16);
        int b2 = Integer.parseInt(ss[1].substring(2), 16);
        int b1 = Integer.parseInt(ss[0].substring(2), 16);

        System.out.println(b1);
        System.out.println(b2);

        //int r = ((b1 & 0xF) << 16) | ((b2 & 0xFF) << 8) | (b3 & 0xFF);
        int r = ((b1 & 0xFF) << 8) | (b2 & 0xFF);

        System.out.println(r);
    }
}
