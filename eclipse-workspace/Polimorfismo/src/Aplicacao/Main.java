package Aplicacao;

import java.util.Scanner;

import Calculadora.CalculadoraEx;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		CalculadoraEx calculadora = new CalculadoraEx();

		int escolhas = 0;
		int valor1 = 0;
		int valor2 = 0;
		int resultado = 0;

		while (escolhas != 7) {
			System.out.println(
					"Por favor informe qual operador lógico será utilizado indicando pelo numero 1 - (+) / 2 - (*) / 3 - (/) / 4 - (-): ");
			escolhas = input.nextInt();

			if (escolhas >= 1 && escolhas <= 4) {
				System.out.println("Digite o primeiro valor para base de calculo: ");
				valor1 = input.nextInt();
				System.out.println("Digite o segundo valor para base de calculo: ");
				valor2 = input.nextInt();
			}
			switch (escolhas) {

			case 1:
				resultado = calculadora.somar(valor1, valor2);
				System.out.println("o Resultado é " + resultado);
				break;
			case 2:
				resultado = calculadora.multiplicar(valor1, valor2);
				System.out.println("o Resultado é " + resultado);
				break;
			case 3:
				resultado = (int) calculadora.dividir(valor1, valor2);
				System.out.println("o Resultado é " + resultado);
				break;
			case 4:
				resultado = calculadora.subtrair(valor1, valor2);
				System.out.println("o Resultado é " + resultado);
				break;
			}
			if (resultado <= 0 || resultado >= 5) {
				System.out.println("operação encerrada.");
				break;
			}
		}

		input.close();

	}

}
