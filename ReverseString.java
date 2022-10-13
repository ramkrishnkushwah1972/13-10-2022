package com.string.bll;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		//Scanner object for input string.
		Scanner sc = new Scanner(System.in);
		
		//User message.
		System.out.println("Enter a string : ");
		String str = sc.nextLine();//scan value and store it.
		System.out.println("Before reverse string :"+str);
		//Calling reverseString method
		char charArray[] =reverseString(str);
		String str1="";
		//Convert Character array to string
		for(char c:charArray)
			str1 +=Character.toString(c);
		//Display reverse string
		System.out.println("After reverse string :"+str1);
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
