package aulas;
import java.util.Scanner;

public class Aula03 {

	public static void main(String args[]) {
	    Scanner input = new Scanner(System.in);
	    int valor = input.nextInt();
	    input.close();

	    int[] notas = { 100, 50, 20, 10, 5, 2, 1 };
	    int resto = valor;

	    for (int nota : notas) {
	      int quantidade = resto / nota;

	      resto %= nota;

	      System.out.printf("%d nota(s) de R$ %d,00%n", quantidade, nota);
	    }
	 }
}
