package Pruebas.prueba;

import org.junit.Test;

import junit.framework.TestCase;

public class SumarTest extends TestCase {

@Test
public void sumarT() {
	Calculadora calc = new Calculadora();
	int resultado = calc.Sumar(2,2);
	assertEquals(resultado,4);
}

}
