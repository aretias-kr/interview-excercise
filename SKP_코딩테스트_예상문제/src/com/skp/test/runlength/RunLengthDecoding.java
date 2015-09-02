package com.skp.test.runlength;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RunLengthDecoding {

	public String decode(String string) {
		Pattern pattern = Pattern.compile("([0-9]+|[A-z])");
		Matcher matcher = pattern.matcher(string);
		
		StringBuilder result = new StringBuilder();
		while(matcher.find()) {
			int charCount = Integer.parseInt(matcher.group());
			
			matcher.find();
			String charactor = matcher.group();
			
			for (int i = 0; i < charCount; i++) {
				result.append(charactor);	
			}
		}
		return result.toString();
	}

}
