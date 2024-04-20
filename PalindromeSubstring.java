package com.stringprograms;
import java.util.Scanner;

//Printing the largest substring palindrom of a given string.

public class PalindromeSubstring {
	static boolean checkPalindrome(String str) {
		int i=0 , j = str.length()-1;
		while(i<j) {
			if(str.charAt(i) == str.charAt(j)) {
				i++;
				j--;
			}
			else {
				return false;
			}
		}
		return true;
	}
	static void printingSubStrings(String str){
		for (int size = str.length()-1 ; size>=1 ; size--){		
			for (int i=0 ; i<=str.length()-size ; i++) {
				 String result = "";
				for (int j=i ; j<i+size ; j++) {
					result += str.charAt(j);
				}
				if(checkPalindrome(result)) {
					System.out.println("The largest substring palindrome of the given string is:");
					System.out.println(result);
					return;
				}
			}
		}
	}
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the String:");
    	String str = scan.nextLine();
    	printingSubStrings(str);
    	scan.close();
    }
}
