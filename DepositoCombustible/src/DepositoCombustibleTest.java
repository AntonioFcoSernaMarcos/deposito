import static org.junit.Assert.*;

import org.junit.*;

public class DepositoCombustibleTest {

	@Test
	public void getDepNivel() {
		DepositoCombustible b=new DepositoCombustible(30,30);
		assertEquals(b.getDepositoNivel(),30,0);
	}
	@Test
	public void getDepMax() {
		DepositoCombustible b=new DepositoCombustible(30,30);
		assertEquals(b.getDepositoMax(),30,0);
	}
	@Test
	public void EstaVacio() {
		DepositoCombustible b=new DepositoCombustible(30,0);
		assertTrue(b.estaVacio()==true);
	}
	@Test
	public void EstaLLeno() {
		DepositoCombustible b=new DepositoCombustible(80,40);
		assertTrue(b.estaLleno()==true);
	}

}
