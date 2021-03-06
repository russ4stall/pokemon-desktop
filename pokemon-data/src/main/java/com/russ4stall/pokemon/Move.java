package com.russ4stall.pokemon;

/**
 * Created by russellf on 3/10/2016.
 */
public enum Move implements DataField {
    NOTHING("0x00", "Nothing"),
    POUND("0x01", "Pound"),
    KARATE_CHOP("0x02", "Karate Chop"),
    DOUBLESLAP("0x03", "Doubleslap"),
    COMET_PUNCH("0x04", "Comet Punch"),
    MEGA_PUNCH("0x05", "Mega Punch"),
    PAY_DAY("0x06", "Pay Day"),
    FIRE_PUNCH("0x07", "Fire Punch"),
    ICE_PUNCH("0x08", "Ice Punch"),
    THUNDERPUNCH("0x09", "Thunderpunch"),
    SCRATCH("0x0a", "Scratch"),
    VICEGRIP("0x0b", "Vicegrip"),
    GUILLOTINE("0x0c", "Guillotine"),
    RAZOR_WIND("0x0d", "Razor Wind"),
    SWORDS_DANCE("0x0e", "Swords Dance"),
    CUT("0x0f", "Cut"),
    GUST("0x10", "Gust"),
    WING_ATTACK("0x11", "Wing Attack"),
    WHIRLWIND("0x12", "Whirlwind"),
    FLY("0x13", "Fly"),
    BIND("0x14", "Bind"),
    SLAM("0x15", "Slam"),
    VINE_WHIP("0x16", "Vine Whip"),
    STOMP("0x17", "Stomp"),
    DOUBLE_KICK("0x18", "Double Kick"),
    MEGA_KICK("0x19", "Mega Kick"),
    JUMP_KICK("0x1a", "Jump Kick"),
    ROLLING_KICK("0x1b", "Rolling Kick"),
    SAND_ATTACK("0x1c", "Sand Attack"),
    HEADBUTT("0x1d", "Headbutt"),
    HORN_ATTACK("0x1e", "Horn Attack"),
    FURY_ATTACK("0x1f", "Fury Attack"),
    HORN_DRILL("0x20", "Horn Drill"),
    TACKLE("0x21", "Tackle"),
    BODY_SLAM("0x22", "Body Slam"),
    WRAP("0x23", "Wrap"),
    TAKE_DOWN("0x24", "Take Down"),
    THRASH("0x25", "Thrash"),
    DOUBLE_EDGE("0x26", "Double Edge"),
    TAIL_WHIP("0x27", "Tail Whip"),
    POISON_STING("0x28", "Poison Sting"),
    TWINEEDLE("0x29", "Twineedle"),
    PIN_MISSILE("0x2a", "Pin Missile"),
    LEER("0x2b", "Leer"),
    BITE("0x2c", "Bite"),
    GROWL("0x2d", "Growl"),
    ROAR("0x2e", "Roar"),
    SING("0x2f", "Sing"),
    SUPERSONIC("0x30", "Supersonic"),
    SONICBOOM("0x31", "Sonicboom"),
    DISABLE("0x32", "Disable"),
    ACID("0x33", "Acid"),
    EMBER("0x34", "Ember"),
    FLAMETHROWER("0x35", "Flamethrower"),
    MIST("0x36", "Mist"),
    WATER_GUN("0x37", "Water Gun"),
    HYDRO_PUMP("0x38", "Hydro Pump"),
    SURF("0x39", "Surf"),
    ICE_BEAM("0x3a", "Ice Beam"),
    BLIZZARD("0x3b", "Blizzard"),
    PSYBEAM("0x3c", "Psybeam"),
    BUBBLEBEAM("0x3d", "Bubblebeam"),
    AURORA_BEAM("0x3e", "Aurora Beam"),
    HYPER_BEAM("0x3f", "Hyper Beam"),
    PECK("0x40", "Peck"),
    DRILL_PECK("0x41", "Drill Peck"),
    SUBMISSION("0x42", "Submission"),
    LOW_KICK("0x43", "Low Kick"),
    COUNTER("0x44", "Counter"),
    SEISMIC_TOSS("0x45", "Seismic Toss"),
    STRENGTH("0x46", "Strength"),
    ABSORB("0x47", "Absorb"),
    MEGA_DRAIN("0x48", "Mega Drain"),
    LEECH_SEED("0x49", "Leech Seed"),
    GROWTH("0x4a", "Growth"),
    RAZOR_LEAF("0x4b", "Razor Leaf"),
    SOLARBEAM("0x4c", "Solarbeam"),
    POISONPOWDER("0x4d", "Poisonpowder"),
    STUN_SPORE("0x4e", "Stun Spore"),
    SLEEP_POWDER("0x4f", "Sleep Powder"),
    PETAL_DANCE("0x50", "Petal Dance"),
    STRING_SHOT("0x51", "String Shot"),
    DRAGON_RAGE("0x52", "Dragon Rage"),
    FIRE_SPIN("0x53", "Fire Spin"),
    THUNDERSHOCK("0x54", "Thundershock"),
    THUNDERBOLT("0x55", "Thunderbolt"),
    THUNDER_WAVE("0x56", "Thunder Wave"),
    THUNDER("0x57", "Thunder"),
    ROCK_THROW("0x58", "Rock Throw"),
    EARTHQUAKE("0x59", "Earthquake"),
    FISSURE("0x5a", "Fissure"),
    DIG("0x5b", "Dig"),
    TOXIC("0x5c", "Toxic"),
    CONFUSION("0x5d", "Confusion"),
    PSYCHIC_M("0x5e", "Psychic"),
    HYPNOSIS("0x5f", "Hypnosis"),
    MEDITATE("0x60", "Meditate"),
    AGILITY("0x61", "Agility"),
    QUICK_ATTACK("0x62", "Quick Attack"),
    RAGE("0x63", "Rage"),
    TELEPORT("0x64", "Teleport"),
    NIGHT_SHADE("0x65", "Night Shade"),
    MIMIC("0x66", "Mimic"),
    SCREECH("0x67", "Screech"),
    DOUBLE_TEAM("0x68", "Double Team"),
    RECOVER("0x69", "Recover"),
    HARDEN("0x6a", "Harden"),
    MINIMIZE("0x6b", "Minimize"),
    SMOKESCREEN("0x6c", "Smokescreen"),
    CONFUSE_RAY("0x6d", "Confuse Ray"),
    WITHDRAW("0x6e", "Withdraw"),
    DEFENSE_CURL("0x6f", "Defense Curl"),
    BARRIER("0x70", "Barrier"),
    LIGHT_SCREEN("0x71", "Light Screen"),
    HAZE("0x72", "Haze"),
    REFLECT("0x73", "Reflect"),
    FOCUS_ENERGY("0x74", "Focus Energy"),
    BIDE("0x75", "Bide"),
    METRONOME("0x76", "Metronome"),
    MIRROR_MOVE("0x77", "Mirror Move"),
    SELFDESTRUCT("0x78", "Selfdestruct"),
    EGG_BOMB("0x79", "Egg Bomb"),
    LICK("0x7a", "Lick"),
    SMOG("0x7b", "Smog"),
    SLUDGE("0x7c", "Sludge"),
    BONE_CLUB("0x7d", "Bone Club"),
    FIRE_BLAST("0x7e", "Fire Blast"),
    WATERFALL("0x7f", "Waterfall"),
    CLAMP("0x80", "Clamp"),
    SWIFT("0x81", "Swift"),
    SKULL_BASH("0x82", "Skull Bash"),
    SPIKE_CANNON("0x83", "Spike Cannon"),
    CONSTRICT("0x84", "Constrict"),
    AMNESIA("0x85", "Amnesia"),
    KINESIS("0x86", "Kinesis"),
    SOFTBOILED("0x87", "Softboiled"),
    HI_JUMP_KICK("0x88", "Hi Jump Kick"),
    GLARE("0x89", "Glare"),
    DREAM_EATER("0x8a", "Dream Eater"),
    POISON_GAS("0x8b", "Poison Gas"),
    BARRAGE("0x8c", "Barrage"),
    LEECH_LIFE("0x8d", "Leech Life"),
    LOVELY_KISS("0x8e", "Lovely Kiss"),
    SKY_ATTACK("0x8f", "Sky Attack"),
    TRANSFORM("0x90", "Transform"),
    BUBBLE("0x91", "Bubble"),
    DIZZY_PUNCH("0x92", "Dizzy Punch"),
    SPORE("0x93", "Spore"),
    FLASH("0x94", "Flash"),
    PSYWAVE("0x95", "Psywave"),
    SPLASH("0x96", "Splash"),
    ACID_ARMOR("0x97", "Acid Armor"),
    CRABHAMMER("0x98", "Crabhammer"),
    EXPLOSION("0x99", "Explosion"),
    FURY_SWIPES("0x9a", "Fury Swipes"),
    BONEMERANG("0x9b", "Bonemerang"),
    REST("0x9c", "Rest"),
    ROCK_SLIDE("0x9d", "Rock Slide"),
    HYPER_FANG("0x9e", "Hyper Fang"),
    SHARPEN("0x9f", "Sharpen"),
    CONVERSION("0xa0", "Conversion"),
    TRI_ATTACK("0xa1", "Tri Attack"),
    SUPER_FANG("0xa2", "Super Fang"),
    SLASH("0xa3", "Slash"),
    SUBSTITUTE("0xa4", "Substitute"),
    STRUGGLE("0xa5", "Struggle");

    private final String hex;
    private final String name;

    Move(String hex, String name) {
        this.hex = hex;
        this.name = name;
    }



    public static Move valueOfHex(String hex) throws Exception {
        for (Move s : Move.values()) {
            if (s.hex.equals(hex)) {
                return s;
            }
        }
        throw new Exception("Cannot convert hex to type " + Move.class.getName());
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


