/**
 * 
 */
package uk.co.andymccall.assignment1;

import java.lang.Character;

/**
 * @author Andy
 *
 */
public class WordPlay {

	public boolean isVowel(char ch) {
		
		boolean vowelFound = false;
		char testChar = Character.toLowerCase(ch);
		
		switch(testChar) {
			case 'a': vowelFound = true;
					break;
			case 'e': vowelFound = true;
					break;
			case 'i': vowelFound = true;
					break;
			case 'o': vowelFound = true;
					break;
			case 'u': vowelFound = true;
					break;
        	default: vowelFound = false;
        			break;
		}
		
		return vowelFound;
	}
	
	public String replaceVowels(String phrase, char ch) {
		
		String newPhrase="";
		
		for (char testCh: phrase.toCharArray()) {
			if (isVowel(testCh)) {
				newPhrase += ch;
			} else {
				newPhrase +=testCh;
			}
		}
		
		return newPhrase;
	}
	
	public String emphasize(String phrase, char ch) {
		
		String newPhrase="";
		
		for (int i = 0; i < phrase.length(); i++) {
			if (Character.toLowerCase(phrase.charAt(i)) == Character.toLowerCase(ch)) {
				if ((i & 1) == 0 ) {
					newPhrase += '*';
				} else
				{
					newPhrase += '+';
				}
			} else {
				newPhrase += phrase.charAt(i);
			}
		}
		
		return newPhrase;
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
