package com.russ4stall.pokemon;

public class IntegerField implements DataField {
	private final int value;
	private final int bytes;

	public IntegerField(final int value, final int bytes) {
		final int max = (int) (Math.pow(2, (8*bytes))-1);
		if(value > max) {
			throw new IllegalArgumentException("Invalid value for "+bytes+" byte field ("+value+")");
		}
		
		this.value = value;
		this.bytes = bytes;
	}

	public IntegerField(String... args) {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < args.length; i++) {
			if (args[i].startsWith("0x")) {
				s.append(args[i].substring(2));
			} else {
				s.append(args[i]);
			}
		}
		this.value = Integer.parseInt(s.toString(), 16);
		this.bytes = args.length;
	}

	public String[] getHex() {
		final String lowByte = "0x" + Integer.toString(value & 0xFF, 16);
		final String highByte = "0x" + Integer.toString((value >> 8) & 0xFF, 16);
		final String higherByte = "0x" + Integer.toString((value >> 16) & 0xFF, 16);
		
		if(bytes == 3) {
			return new String[] {higherByte, highByte, lowByte};
		} else if(bytes == 2) {
			return new String[] {highByte, lowByte};
		} else {
			return new String[] {lowByte};
		}
	}
	
	public String getName() {
		return Integer.toString(value);
	}
	
	public int getValue() {
		return this.value;
	}
}
