package exercicios;

import java.util.Scanner;

public class Loop02 {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    int limite = input.nextInt();

    for (int count = 2; count <= limite; count += 2) {
      long potencia = count * count;
      System.out.println(count + "^2 = " + potencia);
    }

    input.close();
  }

}
