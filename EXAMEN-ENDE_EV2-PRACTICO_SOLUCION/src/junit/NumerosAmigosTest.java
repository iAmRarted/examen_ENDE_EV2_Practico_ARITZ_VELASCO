package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumerosAmigosTest {

	@Test
	public void testAmigoMal() {
		NumerosAmigos naMal = new NumerosAmigos(100, 200);
		assertFalse(naMal.amigo());
	}
	
	@Test
	public void testAmigoPerfecto() {
		NumerosAmigos naPerfecto = new NumerosAmigos(220, 284);
		assertTrue(naPerfecto.amigo());
	}
	
	@Test
	public void testEsCeroN1() {
		NumerosAmigos naCero = new NumerosAmigos(0, 200);
		assertNull(naCero.esN1IgualN2());
	}
	
	@Test
	public void testN1yN2SonIguales() {
		NumerosAmigos naCero = new NumerosAmigos(200, 200);
		Integer num = 1;
		assertEquals(naCero.esN1IgualN2(), num);
	}
	
	@Test
	public void testN1yN2NoSonIguales() {
		NumerosAmigos naCero = new NumerosAmigos(100, 200);
		Integer num = 1;
		assertNotEquals(naCero.esN1IgualN2(), num);
	}

}
