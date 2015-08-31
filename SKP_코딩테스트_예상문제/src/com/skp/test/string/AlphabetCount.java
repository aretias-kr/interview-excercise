package com.skp.test.string;

import java.util.Map;
import java.util.TreeMap;

public class AlphabetCount {
	private String strings;

	public AlphabetCount(String strings) {
		this.strings = strings;
	}

	public Map<String, Integer> toMap() {
		Map<String, Integer> result = new TreeMap<>();
		
		String[] split = strings.split("");
		for (String string : split) {
			if (string.matches("[A-z]")) {
				Integer count = result.get(string);
				if (count == null) {
					count = 0;
				}
				
				result.put(string, ++count);	
			}
		}
		
		return result;
	}
	
}
