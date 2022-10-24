package Avaliativo.ListaAvaliativa2;
import java.util.*;
public class Atv1 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2;

       System.out.print("Escreva o 1° número: ");
         n1 = sc.nextFloat();
       System.out.print("Escreva o 2° número: ");
         n2 = sc.nextFloat();
         sc.close();

       if (n1 > n2) {
       System.out.print("\nO 1º ("+n1+") é maior que o 2º ("+n2+").");
      } else if (n1 < n2) {
       System.out.print("\nO 2º ("+n2+") é maior que o 1º ("+n1+").");
      } else {
       System.out.print("\nOs números são iguais");
        }
        
    }
}
