package com.string.bll;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		//Scanner object for input string.
		Scanner sc = new Scanner(System.in);
		
		//User message.
		System.out.println("Enter a string : ");
		String str = sc.nextLine();//scan value and store it.
		System.out.println("Origional string : "+str);
		
		//Calling reverseString method
		reverseString(str);
		
		//Close scanner object
		sc.close();
	}
	public static void reverseString(String str) {
		for(int i=str.length()-1; i>=0; i--) {
			//if condition used for display print statement only once.
			if(i==str.length()-1)
				System.out.print("Reverse string : ");
			System.out.print(str.charAt(i));
		}
	}

}
