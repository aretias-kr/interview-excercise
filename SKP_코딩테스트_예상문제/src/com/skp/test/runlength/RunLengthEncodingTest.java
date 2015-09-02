package com.skp.test.runlength;

import static org.junit.Assert.*;

import org.junit.Test;

public class RunLengthEncodingTest {

	@Test
	public void test() {
		RunLengthEncoding sut = new RunLengthEncoding();
		String result = sut.encoding("aaabbbccc");
		System.out.println(result);
		assertEquals("3a3b3c", result);
		
	}

}
