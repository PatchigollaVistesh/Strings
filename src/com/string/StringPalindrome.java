package com.string;
import java.util.*;

public class StringPalindrome {
	
	public static int isPalindrome(String S) {
        int check = 0;
        for(int i = 0; i<S.length()/2 ; i++){
            if(S.charAt(i) == S.charAt(S.length()-i-1)){
                check = 1;
            }
            else{
                check = 0;
                break;
            }
        }
        return check;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int output = isPalindrome(word);
		System.out.println(output);
	}

}
