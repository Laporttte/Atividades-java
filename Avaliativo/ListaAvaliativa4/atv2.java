package Avaliativo.ListaAvaliativa4;
import java.util.*;
public class atv2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int d1, d2;
    char op;
    boolean conf=true;

    while (conf) {
    System.out.print("Você quer jogar o dado? (S/N) ");
        op = sc.next().charAt(0);
    if (op=='n'||op=='N') { //nao quer jogar
        conf = false;
    } else {
        d1 = rand.nextInt(1,6);
        System.out.print("Dado 1: "+d1);
        d2 = rand.nextInt(1,6);
        System.out.print("\nDado 2: "+d2);
        if (d1>d2) {
            System.out.println("\nO dado 1 é maior.");
        }
        else if (d1<d2) {
            System.out.println("\nO dado 2 é maior.");
        } else {
            System.out.println("\nEmpate!");
        }
    }
    }
    sc.close();
  }  
}
