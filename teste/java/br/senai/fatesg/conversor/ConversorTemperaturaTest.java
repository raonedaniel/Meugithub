package br.senai.fatesg.conversor;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConversorTemperaturaTest {

	@Test
	public void testConverteCelsiusParaFahrenheit() {
		System.out.println("ConverteCelsiusParaFahrenheit");
		double Fahrenheit = 1.8 * 32 + 32;
		assertEquals(Fahrenheit, ConversorTemperatura.converteCelsiusParaFahrenheit(32), 0.0001);
	}

	@Test
	public void testConverteFahrenheitParaCelsius() {
		System.out.println("ConverteFahrenheitParaCelsius");
		double Celsius = 1.8 * 32 + 32;
		double Fahrenheit = 1.8 * 50 + 32;
		assertEquals(Celsius, ConversorTemperatura.converteFahrenheitParaCelsius(32), 0001);
		assertEquals(Fahrenheit, ConversorTemperatura.converteFahrenheitParaCelsius(50.0), 10.0);
	}

}
