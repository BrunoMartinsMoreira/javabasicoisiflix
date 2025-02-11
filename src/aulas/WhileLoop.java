package aulas;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numero, resultado, contador;

		System.out.println("Digite um numero de 1 a 9");

		numero = input.nextInt();

		contador = 1;

		while (contador <= 10) {
			resultado = numero * contador;
			System.out.println(numero + " x " + contador + " = " + resultado);
			contador++;
		}
		input.close();
	}

}
