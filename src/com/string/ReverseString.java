package com.string;
import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		usingExtraVariable(word);
		usingStack(word);
	}

	private static void usingStack(String word) {
		Stack<Character> revWord = new Stack<>();
		for(int i=0; i<word.length(); i++) {
			revWord.push(word.charAt(i));
		}
		for(int j=0; j<word.length(); j++) {
			revWord.pop();
		}
	}

	private static void usingExtraVariable(String word) {
		String revWord="";
		for(int i=word.length()-1; i>=0; i-- ) {
			revWord += word.charAt(i);
		}
		System.out.println(revWord);
	}

}
