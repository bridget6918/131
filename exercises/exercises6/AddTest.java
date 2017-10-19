package exercises6;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void test() {
		assertEquals(0, Add.add(0, 0));
		//
		// write other test cases here:
		//
		assertEquals(2, Add.add(2, 0));
		assertEquals(3, Add.add(1, 2));
		
		for (int i=0; i < 10; ++i) {
			assertEquals(i, Add.add(0, i));
			assertEquals(i, Add.add(i, 0));
		}
	}
	
	@Test
	public void test2() {
		for (int i=-100; i < 99; ++i) {
			for (int j=-100; j < 200; ++j) {
				assertEquals(i+j, Add.addAny(i, j));
			}
		}
	}
	
	@Test
	public void testAny() {
		assertEquals(-2, Add.addAny(-4, 2));
		assertEquals(-6, Add.addAny(-4, -2));
		assertEquals(3, Add.addAny(5, -2));
	}

}
