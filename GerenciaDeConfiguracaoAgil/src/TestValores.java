import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestValores {
	
	@Test
	public void testIns() {
		Valores val = new Valores();
		boolean x = val.ins(2);
		assertEquals(true, x);
	}
	@Test
	public void testDel() {
		Valores val = new Valores();
		val.ins(1);
		val.ins(2);
		//int x = val.del(2);
		//assertEquals(2, x);
		
	}
	@Test
	public void testSize() {
		Valores val = new Valores();
		int x = val.size();
		assertEquals(-1, x);
		
	}


}
