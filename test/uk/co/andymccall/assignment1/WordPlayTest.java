/**
 * 
 */
package uk.co.andymccall.assignment1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Andy McCall
 *
 */
public class WordPlayTest extends WordPlay {
	
	private WordPlay toTest;
	
	/**
	 * @throws java.lang.Exception
	 */
    @Before
    public void setUp() throws Exception {
    	// Test WordPlay
    	toTest = new WordPlay();
    }
	
	@Test
	public void testIsVowel_UpperCaseVowel_Returns_True() {

		// assert statements
		assertEquals("A must return true", true, toTest.isVowel('A'));
		assertEquals("E must return true", true, toTest.isVowel('E'));
		assertEquals("I must return true", true, toTest.isVowel('I'));
		assertEquals("O must return true", true, toTest.isVowel('O'));
		assertEquals("U must return true", true, toTest.isVowel('U'));

	}
	
	@Test
	public void testIsVowel_LowerCaseVowel_Returns_True() {
		
		// assert statements
		assertEquals("a must return true", true, toTest.isVowel('a'));
		assertEquals("e must return true", true, toTest.isVowel('e'));
		assertEquals("i must return true", true, toTest.isVowel('i'));		
		assertEquals("o must return true", true, toTest.isVowel('o'));	
		assertEquals("u must return true", true, toTest.isVowel('u'));

	}
	
	@Test
	public void testIsVowel_UpperCaseConsonants_Returns_False() {
		
		// assert statements
		assertEquals("B must return false", false, toTest.isVowel('B'));
		assertEquals("9 must return false", false, toTest.isVowel('9'));

	}
	
	@Test
	public void testIsVowel_LowerCaseConsonants_Returns_False() {
		
		// assert statements
		assertEquals("b must return false", false, toTest.isVowel('b'));
		assertEquals("c must return false", false, toTest.isVowel('c'));
		assertEquals("d must return false", false, toTest.isVowel('d'));
		assertEquals("z must return false", false, toTest.isVowel('z'));

	}
	
	@Test
	public void testIsVowel_SymbolsAndSpace_Returns_False() {
		
		// assert statements
		assertEquals("! must return false", false, toTest.isVowel('!'));
		assertEquals("^ must return false", false, toTest.isVowel('^'));
		assertEquals("£ must return false", false, toTest.isVowel('£'));
		assertEquals("+ must return false", false, toTest.isVowel('+'));
		assertEquals("  must return false", false, toTest.isVowel(' '));
	}
	
	@Test
	public void testReplaceVowels_Returns_ValidOutput() {
		
		// assert statements
		assertEquals("must return correct output", "H*ll* W*rld", toTest.replaceVowels("Hello World", '*'));
		assertEquals("must return correct output", "J$v$ R$cks!", toTest.replaceVowels("Java Rocks!", '$'));

	}
	
	@Test
	public void testEmphasize_Returns_ValidOutput() {
		
		// assert statements
		assertEquals("must return correct output", "M+ry Bell+ +br*c*d*br+", toTest.emphasize("Mary Bella Abracadabra", 'a'));
		assertEquals("must return correct output", "dn* ctg+*+ctg+", toTest.emphasize("dna ctgaaactga", 'a'));

	}
	
}