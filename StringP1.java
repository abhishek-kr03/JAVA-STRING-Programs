package com.stringprograms;

import java.util.Scanner;

//STRING REVERSE

public class Main {
	static String stringReverse(String s){
		String t = "";	// initializing an empty string to store reverse string values.
		for (int i=s.length()-1 ; i>=0 ; i--) {
			t = t + s.charAt(i);		
		}
		return t;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string value");
		String s = scan.nextLine();
		String res = stringReverse(s);
		System.out.println(res);
		scan.close();
	}
}
