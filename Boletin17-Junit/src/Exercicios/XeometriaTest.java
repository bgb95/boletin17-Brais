package Exercicios;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class XeometriaTest {
	Xeometria prueba = new Xeometria();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testperímetroCadrado() {
		assertEquals(prueba.perímetroCadrado(1), 4);
		assertEquals(prueba.perímetroCadrado(2), 8);
		assertEquals(prueba.perímetroCadrado(3), 12);
		assertEquals(prueba.perímetroCadrado(-1), 0);
		assertEquals(prueba.perímetroCadrado(-20), 0);
	}

	@Test
	public void testareaCadrado() {
		assertEquals(prueba.areaCadrado(1), 1);
		assertEquals(prueba.areaCadrado(2), 4);
		assertEquals(prueba.areaCadrado(3), 9);
		assertEquals(prueba.areaCadrado(-20), 0);
		assertEquals(prueba.areaCadrado(-1), 0);
	}

	@Test
	public void testteoremaPitagoras() {
		assertEquals(prueba.teoremaPitagoras(-1, 1), 0, 0.001);
		assertEquals(prueba.teoremaPitagoras(1, -1), 0, 0.001);
		assertEquals(prueba.teoremaPitagoras(1, 1), Math.sqrt(2), 0.001);
		assertEquals(prueba.teoremaPitagoras(2, 5), Math.sqrt(29), 0.001);
	}

	public void testteoremaPitagoras2() {
		assertEquals(prueba.teoremaPitagoras2(2, 10), 0, 0.001);
		assertEquals(prueba.teoremaPitagoras2(1, -1), 0, 0.001);
		assertEquals(prueba.teoremaPitagoras2(-1, 1), 0, 0.001);
		assertEquals(prueba.teoremaPitagoras2(2, 5), Math.sqrt(29), 0.001);
	}
}
