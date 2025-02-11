package aulas;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numero, resultado;

		System.out.println("Digite um numero de 1 a 9");

		numero = input.nextInt();

		for (int contador = 0; contador <= 10; contador++) {
			if (numero > 10) {
				continue;
			}

			resultado = numero * contador;
			System.out.println(numero + " x " + contador + " = " + resultado);
		}

		input.close();

	}

}
