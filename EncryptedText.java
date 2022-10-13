package com.string.bll;

public class EncryptedText {	
	//Instance variables
	private int key;
	private String encryptedText="";

	//Parameterized constructor with one argument that is not encrypted yet.
	public EncryptedText(String text) {
		this.encryptedText=text;
	}

	//Parameterized constructor with two arguments	
	public EncryptedText(int key,String encryptedText) {
		this.key = key;
		this.setEncryptedText(encryptedText);
	}

	//Verification of the correctness of an encryption key
	public boolean verifyKey(int key) {
		return this.key== key;//return boolean value
	}

	/*Modification of the encryption key; this is possible only 
	if the correct key is provided.*/
	public boolean modifyKey(int previousKey,int newKey) {
		if(previousKey==this.key) {
			char[] eText = getDecryptedText(previousKey).toCharArray();
			this.key = newKey;
			encryptedText="";
			for(char c:eText)
				encryptedText+=Character.toString(c+=newKey);
			return true;
		}
		else
			return false;
	}
	public String getEncryptedText() {
		return encryptedText;
	}

	public String getDecryptedText(int key) {
		//Verify key
		if(key==this.key ) {
			String decryptedText="";
			char[] eText = encryptedText.toCharArray();
			for(char c:eText) 
				decryptedText +=Character.toString(c-=key); 	
			return decryptedText;
		}
		else
			return "Incorrect key! please enter correct key";	
	}
	
	public void setEncryptedText(String encryptedText) {
		//Convert String to character array.
		char[] eText = encryptedText.toCharArray();
		for(char c:eText) {
			//Add key and ASCII code of character and convert in string and store.
			this.encryptedText+=Character.toString(c+=key); 	
		}
	}
}

