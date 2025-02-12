package exercicios;

import java.util.Scanner;

public class Loop03 {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    int senhaDigitada;

    do {
      senhaDigitada = input.nextInt();
      if (senhaDigitada != 2002) {
        System.out.println("Senha Invalida");
      } else {
        System.out.println("Acesso Permitido");
      }
    } while (senhaDigitada != 2002);

    input.close();
  }

}
