package com.string;
import java.util.*;


public class checkAnagram {
	public static String sort(String str) {
		char c[] = str.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
	public static boolean stringsAnagramCheck(String str1, String str2) {
		str1 = sort(str1);
		str2 = sort(str2);

		if(str1.equals(str2)) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		System.out.println(stringsAnagramCheck(str1, str2));
	}

}
