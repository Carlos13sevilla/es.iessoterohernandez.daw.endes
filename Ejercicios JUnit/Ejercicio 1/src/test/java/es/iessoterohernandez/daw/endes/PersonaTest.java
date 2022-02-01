/**
 * 
 */
package es.iessoterohernandez.daw.endes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author carlo
 *
 */
class PersonaTest {
	
	public static Persona p1;
	public static Persona p2;
	public static Persona p3;
	

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		p1 = new Persona("Rafa", 24, 'H', 120.2, 1.72);
		p2 = new Persona("Ana", 45, 'M', 60.5, 1.62);
		p3 = new Persona("Jose", 16, 'H', 58.2, 1.87);
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalcularIMC() {
		assertEquals(1, p1.calcularIMC());
		assertEquals(0, p2.calcularIMC());
		assertEquals(-1, p3.calcularIMC());
	}

	@Test
	void testEsMayorDeEdad() {
		assertTrue(p1.esMayorDeEdad());
		assertTrue(p2.esMayorDeEdad());
		assertFalse(p3.esMayorDeEdad());
	}

}
