import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C32Test {
	C32 c32;
	@Before
	public void setUp() {
		c32 = new C32();
	}
	
	@Test
	public void testMA() {
		assertEquals("mA", c32.mA());
	}
	
}
