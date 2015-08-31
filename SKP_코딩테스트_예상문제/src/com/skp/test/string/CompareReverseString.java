package com.skp.test.string;

public class CompareReverseString {

	public boolean compare(String string) {
		char[] charArray = string.toCharArray();
		int length = charArray.length;
		
		for (int i = 0; i < length / 2; i++) {
			char c = charArray[i];
			char d = charArray[length - (i + 1)];
			
			if (c != d) {
				return false;
			}
		}
		
		return true;
	}
}
