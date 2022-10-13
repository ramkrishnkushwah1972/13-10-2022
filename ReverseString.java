package com.string.bll;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		//Scanner object for input string.
		Scanner sc = new Scanner(System.in);
		
		//User message.
		System.out.println("Enter a string : ");
		String str = sc.nextLine();//scan value and store it.
		
		//Calling reverseString method
		char charArray[] =reverseString(str);
		for(char c:charArray)
			System.out.print(c);
		
		//Close scanner object
		sc.close();
	}
	public static char[] reverseString(String str) {
		char charArray[] =new char[str.length()];
		int index=0;
		for(int i=str.length()-1; i>=0; i--) {
			charArray[index] = (str.charAt(i));
			index++;
		}
		return charArray;
	}

}
