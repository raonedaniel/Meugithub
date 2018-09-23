package br.senai.fatesg.conversor;

public class ConversorTemperatura {

	public static double converteCelsiusParaFahrenheit(double celsius) {
		double Fahrenheit = 1.8 * celsius + 32;
		return Fahrenheit;
	}

	public static double converteFahrenheitParaCelsius(double Fahrenheit) {
		double celsius = (5 / 9) * (Fahrenheit - 32);
		return celsius;
	}
}
