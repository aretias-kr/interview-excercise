package com.skp.test.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Greedy {

	private static final List<Integer> moneys = Arrays.asList(10, 100, 500, 1000, 5000, 10000, 50000);
	
	static {
		Collections.sort(moneys, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 > o2) {
					return -1;
				} else {
					return 1;
				}
			}
		});
	}
	
	public Map<Integer, Integer> buy(int price, int paid) {
		
		Map<Integer, Integer> result = new HashMap<>();
		
		int change = paid - price;
		for (Integer money : moneys) {
			if (change == 0) {
				return result;
			}
			
			int amount = change / money;
			change = change % money;
			
			result.put(money, amount);
		}
		return result;
	}
	
}
