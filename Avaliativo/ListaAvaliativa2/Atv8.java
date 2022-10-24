package  Avaliativo.ListaAvaliativa2;

import java.util.*;

public class Atv8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int a, b, x = 0, soma, acerto = 0;

    System.out.print("\tSe prepare, aqui vai 5 perguntas:\n");
    while (x < 5) {
      a = rand.nextInt(1, 100);
      b = rand.nextInt(1, 100);
      System.out.print("\nQuanto é " + a + "+" + b + "? ");
      soma = sc.nextInt();
      if (a + b == soma) {
        acerto++;
      }
      System.out.print(+a + "+" + b + " é igual a " + (a + b) + "\n");
      x++;
    }
    sc.close();
    System.out.print("\nVocê teve " + acerto + " acertos");
  }
}