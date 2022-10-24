package Avaliativo.ListaAvaliativa2;
import java.util.*;
public class Atv6 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
  int ano;

  System.out.print("Digite o ano: ");
    ano = sc.nextInt();
    sc.close();

    if((ano%400==0) || (ano%4==0 && ano%100 !=0)) {
        System.out.print("É bissexto.");
    } else {
        System.out.print("Não é bissexto.");
    }
}
}
