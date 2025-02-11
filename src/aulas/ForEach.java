package aulas;

import java.util.Scanner;

public class ForEach {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Scanner input = new Scanner(System.in);

		int numero, resultado;

		System.out.println("Digite um numero de 1 a 9");

		numero = input.nextInt();

		for (int num : numbers) {
			resultado = numero * num;
			System.out.println(numero + " x " + num + " = " + resultado);
		}

		input.close();

	}

}
