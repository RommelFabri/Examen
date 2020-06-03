package unibe.edu.ec.examen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TrianguloTest {
	private Triangulo triangulo;
	@Before
	public void before () {
		triangulo = new Triangulo(4.0,5.0);
	}
	@Test
	public void testarea() {
	assertEquals(12, triangulo.perimeter(), 0.0);
	}
	@Test
	public void testperimeter() {
	assertEquals(10, triangulo.area(5.0),0.0);
	}
	@Test
	public void testvolume() {
	assertEquals(26.66,triangulo.volume(4.0,5.0),0.10);
	}

}