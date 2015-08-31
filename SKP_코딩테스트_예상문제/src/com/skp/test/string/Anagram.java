package com.skp.test.string;

import java.util.Map;

public class Anagram {

	public boolean isSame(String string, String string2) {
		Map<String, Integer> stringMap = new AlphabetCount(string).toMap();
		Map<String, Integer> string2Map = new AlphabetCount(string2).toMap();
		
		return stringMap.equals(string2Map);
	}
	
}
