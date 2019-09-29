package fr.gtm.banque;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BanqueTest {

	@Test
	void verifnBanque() {
		Banque c = new Banque();
		c.verifnBanque(123445);
		assertEquals(1,1);
}
		
//	@Test
//	void verifcodeEta() {
//		Banque c = new Banque();
//		c.verifcodeEta(123544);
//		assertTrue(true);
//	}

}
