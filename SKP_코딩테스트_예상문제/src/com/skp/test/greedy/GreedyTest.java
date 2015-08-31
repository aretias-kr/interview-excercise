package com.skp.test.greedy;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Test;

public class GreedyTest {

	@Test
	public void test() {
		Greedy sut = new Greedy();
		Map<Integer, Integer> changes = sut.buy(2000, 10000);
		
		assertEquals(changes.get(5000).intValue(), 1);
		assertEquals(changes.get(1000).intValue(), 3);
	}

}
