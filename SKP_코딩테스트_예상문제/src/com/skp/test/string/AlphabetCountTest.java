package com.skp.test.string;

import static org.junit.Assert.assertEquals;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class AlphabetCountTest {

	@Test
	public void test() {
		String strings = "strings";
		AlphabetCount sut = new AlphabetCount(strings);
		Map<String, Integer> result = sut.toMap();
		
		assertEquals(2, result.get("s").intValue());
		assertEquals(1, result.get("t").intValue());
		assertEquals(1, result.get("r").intValue());
		assertEquals(1, result.get("i").intValue());
		assertEquals(1, result.get("n").intValue());
		assertEquals(1, result.get("g").intValue());
		
		Set<Entry<String, Integer>> entrySet = result.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry);
		}
	}

}
