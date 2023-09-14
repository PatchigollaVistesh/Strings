package com.string;

import java.util.*;

public class PrintDuplicatesCountByHashingWithSortedMap {
	//using SortedMap
	public static void duplicateCount(String word) {
		SortedMap<Character, Integer> chars = new TreeMap<>();
		for (int i = 0; i < word.length(); i++) {
			if (chars.containsKey(word.charAt(i))) {
				chars.put(word.charAt(i),chars.get(word.charAt(i))+1);
			}
			else {
				chars.put(word.charAt(i), 1);
			}
		}
		System.out.println(chars);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		duplicateCount(word);
	}

}
