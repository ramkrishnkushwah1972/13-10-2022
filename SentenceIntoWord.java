package com.string.bll;

import java.util.Scanner;

public class SentenceIntoWord {

	public static void main(String[] args) {
		// Scanner object for input string.
		Scanner sc = new Scanner(System.in);

		// User message.
		System.out.println("Enter a sentence : ");
		String sentence = sc.nextLine();
		
		String[] words = sentenceIntoWord(sentence);
		System.out.print("Break sentence into words : ");
		for(String w:words)
			System.out.print(w+" ");
		
		// Calling sortword method
		String[] Sorted_words = sortWord(words);
		//Display sorted word
		System.out.print("\nSorted words : ");
		for(String w:Sorted_words)
			System.out.print(w+" ");
		
		sc.close();
	}
	//This method for break sentence into words
	public static String[] sentenceIntoWord(String sentence) {
		int count_space = 0;
	    int index = 0;
	    char[] charArray = sentence.toCharArray();

	    for (int i = 0; i < charArray.length; i++) 
	        if (charArray[i] == ' ') 
	        	count_space++;
	    
	    String[] words = new String[count_space + 1];
	    String temp = "";
	    for (int i = 0; i <charArray.length; i++) {
	        if (charArray[i] != ' ') {
	        	temp +=charArray[i];
	        } else {
	        	words[index++] = temp;
	            temp = "";
	        }
	    }
	    words[index] = temp;
	
		return words;
	}
	//Method for sorted words
	public static String[] sortWord(String[] wordsArray) {
		for(int i=0; i<wordsArray.length; i++) {
			for(int j=i; j<wordsArray.length; j++) {
				if(wordsArray[i].length() > wordsArray[j].length()){
					//Swap words
					String temp=wordsArray[j];//temporary variable
					wordsArray[j]=wordsArray[i];
					wordsArray[i]=temp;
				}
			}
		}
		return wordsArray;
	}
}
