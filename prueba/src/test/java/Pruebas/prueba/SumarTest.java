package Pruebas.prueba;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class SumarTest {

@Test
public void sumarT() {
	Calculadora calc = new Calculadora();
	int resultado = calc.Sumar(2,2);
	assertEquals(4,resultado);
}
@Test
public void sumarMax() {
	Calculadora calc = new Calculadora();
	int resultado = calc.Sumar(Integer.MAX_VALUE,1);
	assertEquals("overflow",resultado);
}
}
