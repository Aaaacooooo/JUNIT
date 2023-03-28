package Ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculadoraTest {

	@Test
	void testSuma() {
		calculadora calcu = new calculadora(20, 10);
		int resultado = calcu.suma();
		assertEquals(30, resultado);
	}

	@Test
	void testResta() {
		calculadora calcu = new calculadora(20, 10);
		int resultado = calcu.resta();
		assertEquals(10, resultado);
	}

	@Test
	void testMultiplica() {
		calculadora calcu = new calculadora(20, 10);
		int resultado = calcu.multiplica();
		assertEquals(200, resultado);
	}

	@Test
	void testDivide() {
		calculadora calcu = new calculadora(20, 10);
		int resultado = calcu.divide();
		assertEquals(2, resultado);
	}

}
