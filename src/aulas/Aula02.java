package aulas;

import java.util.Scanner;

public class Aula02 {
  public static void main (String args[]){
    Scanner teclado = new Scanner(System.in);

    String nome;
    int idade;
    double tamanhoDoPau;

    // int a;
    // float b;
    // double c;

    // System.out.println("Digite um inteiro:");
    // a = teclado.nextInt();
    // System.out.println("Voce digitou:" + a);

    // System.out.println("Digite um float:");
    // b = teclado.nextFloat();
    // System.out.println("Voce digitou:" + b);

    // System.out.println("Digite um double:");
    // c = teclado.nextDouble();
    // System.out.println("Voce digitou: %.3f\n" + c);

    System.out.println("Digite seu nome:");
    nome = teclado.nextLine();

    System.out.println("Digite sua idade:");
    idade = Integer.parseInt(teclado.nextLine());

    System.out.println("Digite o tamanho do seu pau:");
    tamanhoDoPau = Double.parseDouble(teclado.nextLine());

    System.out.println("Seu nome é " + nome + " voce tem " + idade + " anos e " + tamanhoDoPau + "cm de pau!" );

    teclado.close();
  }
}