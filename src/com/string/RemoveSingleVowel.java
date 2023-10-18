package com.string;

import java.util.*;

public class RemoveSingleVowel {

	public static void vowelIdentification(String word) {

		
		List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
		for(int i=0;i<word.length();i++) {
			if(vowels.contains(word.charAt(i))) {
				if(i == 0) {
					if(vowels.contains(word.charAt(i+1))) continue;
					else word = word.substring(1, word.length());
				}
				else if( i == word.length()-1) {
					if(vowels.contains(word.charAt(i-1))) continue;
					else word = word.substring(0, word.length()-1);
				}
				else {
					if(vowels.contains(word.charAt(i-1)) || vowels.contains(word.charAt(i+1))) {
						continue;
					}
					else word = word.substring(0,i) +word.substring(i+1, word.length());
				}
			}
		}
		System.out.println(word);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		vowelIdentification(word);
	}

}
