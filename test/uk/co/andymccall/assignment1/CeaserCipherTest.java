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
public class CeaserCipherTest {

	CeaserCipher toTest;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
    	// Test WordPlay
    	toTest = new CeaserCipher();
	}

	@Test
	public void testEncrypt_Returns_ValidOutput() {
		
		// assert statements
		assertEquals("must return correct output", "CFOPQ IBDFLK XQQXZH BXPQ CIXKH!", toTest.encrypt("FIRST LEGION ATTACK EAST FLANK!", 23));

	}

}
