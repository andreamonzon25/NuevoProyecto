package testTopicos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
public void sumarTest () {
	Calculadora c= new Calculadora();
	int resul = c.sumar(2,2);
	assertEquals(4,resul);
}
@Test
	public void restarTest(){
		Calculadora c = new Calculadora();
		int res = c.restar(5,3);
		assertEquals(2,res);


	}
	//@Test (expected=Exception.class)
}
