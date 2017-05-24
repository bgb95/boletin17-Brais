package Exercicios;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.ArrayList;

public class DNITest {
	DNI prueba = new DNI();

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
	public void testEValidoString() {
		assertEquals(prueba.eValido("127854568"), false);
		assertEquals(prueba.eValido("1254"), false);
		assertEquals(prueba.eValido("45860341C"), true);
		assertEquals(prueba.eValido("W345678Q"), false);
		assertEquals(prueba.eValido("1234507NN"), false);
		assertEquals(prueba.eValido("12345678&"), false);
		assertEquals(prueba.eValido("1234_5678Z"), false);
	}

	@Test
	public void testSoloNumeros() {
		assertEquals(prueba.soloNumeros("12345678"),true);
		assertEquals(prueba.soloNumeros("1234 5678"),false);
		assertEquals(prueba.soloNumeros("12345078N"),true);
		assertEquals(prueba.soloNumeros("1234_56781"),false);
	}

	@Test
	public void testCalculaLetraString() {
		assertEquals(prueba.calculaLetra("123456781"),0);
		assertEquals(prueba.calculaLetra("12345678"),14);
		assertEquals(prueba.calculaLetra("K2345678"),0);
		assertEquals(prueba.calculaLetra("/2345678"),0);
	}

	@Test
	public void testEValidoArrayListOfIntegerChar() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(0,1);
		numeros.add(1,2);
		numeros.add(2,3);
		numeros.add(3,4);
		numeros.add(4,5);
		numeros.add(5,0);
		numeros.add(6,7);
		numeros.add(7,8);
		assertEquals(prueba.eValido(numeros,'N'),true);
		numeros.remove(5); 
		numeros.add(5,63);
		assertEquals(prueba.eValido(numeros,'N'),false);
		numeros.remove(5); 
		numeros.add(5,6);
		assertEquals(prueba.eValido(numeros,'N'),false);
		numeros.add(8,9);
		assertEquals(prueba.eValido(numeros,'N'),false);
	}

	@Test
	public void testCalculaLetraArrayListOfInteger() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(0,1);
		numeros.add(1,2);
		numeros.add(2,3);
		numeros.add(3,4);
		numeros.add(4,5);
		numeros.add(5,0);
		numeros.add(6,7);
		numeros.add(7,8);
		assertEquals(prueba.calculaLetra(numeros),12);
		numeros.remove(5); 
		numeros.add(5,63);
		assertEquals(prueba.calculaLetra(numeros),-1);
		numeros.remove(5);
		numeros.add(5,0);
		numeros.add(8,9);
		assertEquals(prueba.calculaLetra(numeros),-1);
	}

}
