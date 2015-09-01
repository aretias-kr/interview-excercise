package com.skp.test.sort;

public class MergeSortedArray {
	public String[] merge (String[] arr1, String[] arr2) {
		int length = arr1.length + arr2.length;
		String [] result = new String [length];
		
		for (int i = 0, j = 0, k = 0; k < length; k++) {
			if (i >= arr1.length) {
				result[k] = arr2[j++];
			} else if (j >= arr2.length) {
				result[k] = arr1[i++];
			} else if (arr1[i].compareTo(arr2[j]) <= 0) {
				result[k] = arr1[i++];
			} else {
				result[k] = arr2[j++];
			}
		}
		
		return result;
	}
}
