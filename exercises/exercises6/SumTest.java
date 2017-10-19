package exercises6;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumTest {

	@Test
	public void test() {
		assertEquals(0, Sum.sum(0));
		assertEquals(1, Sum.sum(1));
		assertEquals(6, Sum.sum(3));
		
		// better way to test as in the video
		for (int i=0; i < 1000; ++i) {
			int ans = i*(i+1)/2;
			assertEquals(ans, Sum.sum(i));
		}
	}

}
