/**
 * 
 */
package uk.co.andymccall.assignment1;

/**
 * @author Andy McCall
 *
 */
public class CeaserCipher {

	public String encrypt(String input, int key) {
		
		String encryptedPhrase="";
		
		for (char ch : input.toCharArray()) {
			encryptedPhrase += ch;
		}
		
		return encryptedPhrase;
	}
	
}
