package tests;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import gerenciadeconfiguracao.Valores;

public class TestValores {
	
	private Valores val;
	
	@Before
	public void setUp() throws Exception{
		val = new Valores();
		val.ins(5);//[0]
		val.ins(12);//[1]
		val.ins(1);//[2]
		val.ins(30);//[3]
		val.ins(152);//[4]
		val.ins(6);//[5]
	}
	
	@Test
	public void testIns() {
		assertEquals(false, val.ins(-10));
		assertEquals(false, val.ins(0));
		val.ins(2);
		assertEquals(7, val.size());
		val.ins(3);
		assertEquals(8, val.size());
		val.ins(4);
		assertEquals(9, val.size());
		val.ins(5);
		assertEquals(10, val.size());
		assertEquals(false, val.ins(11));
	}
	@Test
	public void testDel() {
		assertEquals(5, val.del(0));
		assertEquals(152, val.del(4));
		assertEquals(-1, val.del(4));
		assertEquals(152, val.del(0));
		assertEquals(-1, val.del(0));
		
	}
	@Test
	public void testSize() {
		
		
	}


}
