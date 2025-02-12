package exercicios;

import java.util.Scanner;

public class Loop01 {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    int val = input.nextInt();

    if (val % 2 == 0) {
      val++;
    }

    for (int count = 1; count <= 6; count++) {
      System.out.println(val);
      val += 2;
    }

    input.close();
  }
}
