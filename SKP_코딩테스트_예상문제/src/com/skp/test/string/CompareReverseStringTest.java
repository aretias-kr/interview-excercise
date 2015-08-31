package com.skp.test.string;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompareReverseStringTest {

	@Test
	public void testFail() {
		CompareReverseString sut = new CompareReverseString();
		assertFalse(sut.compare("abc"));
	}
	
	@Test
	public void testSuccess() {
		CompareReverseString sut = new CompareReverseString();
		assertTrue(sut.compare("aba"));
	}
	
	@Test
	public void testSuccess2() {
		CompareReverseString sut = new CompareReverseString();
		assertTrue(sut.compare("abcdefedcba"));
	}
}
