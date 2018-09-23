package br.senai.fatesg.conversor;

public class TemperaturaCelsius {
	private double celsius;
	
	public TemperaturaCelsius(double celsius) {
		this.celsius = celsius;
	}

	public double converteCelsiusParaFahrenheit() {
		double Fahrenheit = 1.8f * celsius + 32;
		return Fahrenheit;
	}
}
