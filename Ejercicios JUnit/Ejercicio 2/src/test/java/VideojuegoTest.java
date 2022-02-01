import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VideojuegoTest {

	static Videojuego v1;
	static Videojuego v2;
	static Videojuego v3;
	static Videojuego v4;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		v1 = new Videojuego("Clash of Clans", 45, "Estrategia", "Supercell");
        v2 = new Videojuego("Rocket League", 45, "Habilidad", "Epic Games");
        v3 = new Videojuego("League of legends", 543, "Moba", "Riot");
        v4 = new Videojuego("Rocket League", 45, "Habilidad", "Epic Games");
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
	void testSetTitulo() {
		v1.setTitulo("Clash of Clans");
        assertEquals("Clash of Clans", v1.getTitulo());
	}

	@Test
	void testSetHorasEstimadas() {
		v1.setHorasEstimadas(60);
        assertEquals(60, v1.getHorasEstimadas());
	}

	@Test
	void testSetGenero() {
		v1.setGenero("Estrategia");
        assertEquals("Estrategia", v1.getGenero());
	}

	@Test
	void testEntregar() {
		v1.entregar();
        assertEquals(true, v1.isEntregado());
	}

	@Test
	void testDevolver() {
		v1.devolver();
        assertEquals(false, v1.isEntregado());
	}

	@Test
	void testIsEntregado() {
		v1.devolver();
        assertEquals(false, v1.isEntregado());
	}

	@Test
	void testCompareTo() {
		assertEquals(Videojuego.MENOR, v1.compareTo(v3));
        assertEquals(Videojuego.MAYOR, v3.compareTo(v1));
        assertEquals(Videojuego.IGUAL, v1.compareTo(v2));
	}

	@Test
	void testToString() {
		assertEquals("Informacion del videojuego: \n"
                + "\tTitulo: " + v2.getTitulo() + "\n"
                + "\tHoras estimadas: " + v2.getHorasEstimadas() + "\n"
                + "\tGenero: " + v2.getGenero() + "\n"
                + "\tcompañia: " + v2.getcompañia(), v2.toString());
	}

	@Test
	void testEqualsVideojuego() {
		assertEquals(false, v1.equals(v2));
        assertEquals(true, v4.equals(v2));
	}

}
