package com.stringprograms;
import java.util.Scanner;

public class PanindromSubstring {
	static boolean checkPanindrom(String str) {
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
				if(checkPanindrom(result)) {
					System.out.println(result);
					return;
				}
			}
		}
	}
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	String str = scan.nextLine();
    	printingSubStrings(str);
    	scan.close();
    }
}
