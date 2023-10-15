package com.string;

import java.util.Scanner;

//  Test Cases :
//  input: str1 : bombay , str2 : om* -> output : ombay
//  input: str1 : calcutta , str2 : da* -> output : No Match Found

public class FindingSubStringFromAnother {
	
	public static int stringAnagramCheck(String str1, String str2) {
		
		str1.indexOf(str2.charAt(1));
		int index = Integer.MIN_VALUE;
		for(int i=0;i<str1.length();i++) {
			if(str2.charAt(1) == str1.charAt(i)) {
				if(str2.charAt(0) == str1.charAt(i-1)) {
					return str1.indexOf(str1.charAt(i-1));
				}
			}
		}
		return index;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		int index = stringAnagramCheck(str1, str2);
		if(index == Integer.MIN_VALUE) {
			System.out.println("No Matches Found");
			return;
		}
		for(int i=index;i<str1.length();i++) {
			System.out.print(str1.charAt(i));
		}
	}

}
