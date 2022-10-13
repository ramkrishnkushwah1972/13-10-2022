package com.string.bll;

public class TestEncryptedText {

	public static void main(String[] args) {

		EncryptedText encrypt= new EncryptedText(5,"Hello, I am Ramkrishna and i like java.");
		
		System.out.println("Encrypted text : "+encrypt.getEncryptedText());
		System.out.println("Decrypted text : "+encrypt.getDecryptedText(5));
		
		//Verify of the correctness of an encryption key
		if(encrypt.verifyKey(5)) {
			System.out.println("This is correct key");
		}
		else
			System.out.println("This is Incorrect key");
		
		//Change new key
		System.out.println("=============================================");
		if(encrypt.modifyKey(5,11)) {
			System.out.println("Successfully changed key.");
		}
		else
			System.out.println("Not changed key! please enter correct previous key.");
		
		//Values after Change key
		System.out.println("After change key :");
		System.out.println("Encrypted text : "+encrypt.getEncryptedText());
		System.out.println("Decrypted text : "+encrypt.getDecryptedText(11));
	}	
}
