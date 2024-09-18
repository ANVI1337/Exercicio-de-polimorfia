package Calculadora;

public class CalculadoraEx {
	/*
	 * Esta é uma super classe. Será utilizada como base para estudo de polimofismo.
	 */

	// sobrecarga de metodo para somar dois inteiros.
	public int somar(int a, int b) {
		return a + b;
	}

	// sobrecarga de método para somar três inteiros
	public int somar(int a, int b, int c) {
		return a + b + c;
	}

	// sobrecarga de método para somar dois números de ponto flutuante.
	public double somar(double a, double b) {
		return a + b;
	}

	public int multiplicar(int a, int b) {
		return a * b;
	}

	public double dividir(double a, double b) {
		return a / b;
	}

	public int subtrair(int a, int b) {
		return a - b;
	}
}