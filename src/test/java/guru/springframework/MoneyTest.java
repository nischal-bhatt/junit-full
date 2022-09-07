package guru.springframework;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MoneyTest {

	@Test
	void testMultiplication()
	{
		Dollar toTest = new Dollar(18);
		Dollar product = toTest.times(2);
		
		assertEquals(36,product.getAmount());
		product = toTest.times(3);
		assertEquals(54,product.getAmount());
		product = toTest.times(10);
		assertEquals(180,product.getAmount());
		// now we not mutating the object
		
	}
}
