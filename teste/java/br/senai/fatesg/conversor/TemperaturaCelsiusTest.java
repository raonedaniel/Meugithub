package br.senai.fatesg.conversor;

import static org.junit.Assert.*;

import org.junit.Test;

public class TemperaturaCelsiusTest {

	//@Test
	//public void testTemperaturaCelsius() {
		//fail("Not yet implemented");
	//}

	@Test
	public void testConverteCelsiusParaFahrenheit() {
		//System.out.println("converteCelsiusParaFahrenheit");
		//double Fahrenheit = 1.8 * 32 + 32;
		assertEquals(89.5, new TemperaturaCelsius(32).converteCelsiusParaFahrenheit(),0.1);
	}

}
