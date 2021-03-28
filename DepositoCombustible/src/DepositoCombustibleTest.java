import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DepositoCombustibleTest {

	@Test
	void getDepNivel() {
		DepositoCombustible b=new DepositoCombustible(30,30);
		assertEquals(b.getDepositoNivel(),30);
	}
	@Test
	void getDepMax() {
		DepositoCombustible b=new DepositoCombustible(30,30);
		assertEquals(b.getDepositoMax(),30);
	}
	@Test
	void EstaVacio() {
		DepositoCombustible b=new DepositoCombustible(30,0);
		assertTrue(b.estaVacio()==true);
	}
	@Test
	void EstaLLeno() {
		DepositoCombustible b=new DepositoCombustible(80,40);
		assertTrue(b.estaLleno()==true);
	}

}
