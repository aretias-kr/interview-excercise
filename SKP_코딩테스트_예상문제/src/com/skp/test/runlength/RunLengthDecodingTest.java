package com.skp.test.runlength;

import static org.junit.Assert.*;

import org.junit.Test;

public class RunLengthDecodingTest {

	@Test
	public void test() {
		RunLengthDecoding sut = new RunLengthDecoding();
		String result = sut.decode("3w1s1k1p1c1o1m");
		System.out.println(result);
		assertEquals("wwwskpcom", result);
	}

}
