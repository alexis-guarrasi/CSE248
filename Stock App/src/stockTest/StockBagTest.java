// Test Driven Development
package stockTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import stock.StockBag;

public class StockBagTest {
	
	@Test
	void testGetGrandTotal() {
		StockBag theBag = new StockBag(1000);
		theBag.insert("googl", 1, 100);
		theBag.insert("amzn", 2.00, 200);
		assertEquals(500.0, theBag.getGrandTotal());
	}

}
