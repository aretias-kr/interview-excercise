package com.skp.test.string;

import static org.junit.Assert.*;

import java.util.TreeMap;

import org.junit.Test;

public class AnagramTest {

	@Test
	public void testMapCompare() throws Exception {
		TreeMap<String, Integer> map1 = new TreeMap<>();
		TreeMap<String, Integer> map2 = new TreeMap<>();
		TreeMap<String, Integer> map3 = new TreeMap<>();
		
		map1.put("a", 1);
		map2.put("a", 1);
		map3.put("a", 2);
		
		assertEquals(map1, map2);
		assertNotEquals(map1, map3);
	}
	
	@Test
	public void same_anagram() throws Exception {
		Anagram sut = new Anagram();
		boolean result = sut.isSame("strings", "sgnirts");
		assertTrue(result);
	}
	
	@Test
	public void diff_anagram() throws Exception {
		Anagram sut = new Anagram();
		boolean result = sut.isSame("strings", "stringss");
		assertFalse(result);
	}

}
