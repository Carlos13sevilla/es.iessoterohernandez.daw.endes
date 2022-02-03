package cuentas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {

	static Cuenta c1;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		c1 = new Cuenta("18", "Carlos");
	}


	@Test
	public void testIngresar() {
		try {
			c1.ingresar("Futbol", 100);
		} catch (Exception e) {
			fail("Error en el ingreso");
		}
		assertFalse(c1.getSaldo() == 100.0);
	}

	@Test
	public void testRetirar() {		
		try {
			c1.ingresar("Paga", 1000);
			c1.retirar("Comida", 500);
		} catch (Exception e) {
			fail("Error al ingresar/retirar");
		}
		assertEquals(500.0, c1.getSaldo());
	}

	@Test
	public void testIngresarConConcepto() {
		try {
			c1.ingresar("Ingreso", 1000);
		} catch (Exception e) {
			fail("Error en el ingreso");
		}
		assertTrue(c1.getSaldo() == 1000.0);
	}

	@Test
	public void testRetirarConConcepto() {
		try {
			c1.ingresar("Deuda saldada", 1000);
			c1.retirar("Retirada", 500);
		} catch (Exception e) {
			fail("Error en la retirada");
		}
		assertEquals(500.0, c1.getSaldo());
	}

	@Test
	public void testGetSaldo() {
		try {
			c1.ingresar("Paga extraordinaria 2", 500);
		} catch (Exception e) {
			fail("Error al ingresar");
		}
		assertEquals(500.0, c1.getSaldo());
	}
	
	@Test
	public void testAddMovimiento() {
		Movimiento m = new Movimiento();
		m.setConcepto("Paga extra");
		m.setImporte(300);
		c1.addMovimiento(m);
		assertEquals(300.0, c1.getSaldo());
	}

}
