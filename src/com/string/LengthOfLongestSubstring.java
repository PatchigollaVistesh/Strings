package com.string;
import java.util.HashMap;
import java.util.Scanner;
public class LengthOfLongestSubstring {
	public static void lengthlongestSubstring(String S) {
		HashMap< Character, Integer> map = new HashMap<>();
		int left = 0, right = 0;
		int length =0;
		while(right < S.length()) {
			if(map.containsKey(S.charAt(right))) {
				left = Math.max(map.get(S.charAt(right))+1, left);
			}
			map.put(S.charAt(right), right);
			length = Math.max(length, right-left+1);
			right++;
		}
		System.out.println(length);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		lengthlongestSubstring(S);
	}

}
