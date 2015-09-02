package com.skp.test.runlength;

public class RunLengthEncoding {

	public String encoding(String source) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < source.length(); i++) {
			int size = 1;
			
			while (i + 1 < source.length() && source.charAt(i) == source.charAt(i + 1)) {
				size++;
				i++;
				continue;
			}
			
			sb.append(size);
			sb.append(source.charAt(i));
		}
		
		return sb.toString();
	}
	
}
