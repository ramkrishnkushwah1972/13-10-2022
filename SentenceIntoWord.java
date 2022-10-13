package com.string.bll;

import java.util.Scanner;

public class SentenceIntoWord {

	public static void main(String[] args) {
		// Scanner object for input string.
		Scanner sc = new Scanner(System.in);

		// User message.
		System.out.println("Enter a sentence : ");
		String sentence = sc.nextLine();
		
		//Break up the sentence into words and display
		String[] words = sentence.split(" ");
		System.out.print("Break sentence into words : ");
		for(String w:words)
			System.out.print(w+" ");
		
		// Calling sortword method
		sortWord(words);

		// Close scanner object
		sc.close();
	}
	public static void sortWord(String[] words) {
		for(int i=0; i<words.length; i++) {
			for(int j=i; j<words.length; j++) {
				if(words[i].length() > words[j].length()){
					//Swaping words
					String temp=words[j];//temporary variable
					words[j]=words[i];
					words[i]=temp;
				}
			}
		}
		//Print sorted word according to the length of word
		System.out.print("\nSorted sentense : ");
		for(String s: words)
		System.out.print(s+" ");
	}
}