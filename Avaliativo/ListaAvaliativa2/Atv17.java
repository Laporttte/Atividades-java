package Avaliativo.ListaAvaliativa2;
import java.util.*;
public class Atv17 {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        float n1, n2;
      
       System.out.print("1° número: ");
         n1 = sc.nextFloat();
       System.out.print("2° número: ");
         n2 = sc.nextFloat();
         sc.close();
      
       if (n1 > n2) {
       System.out.print("\nO 1º número é maior que o 2º.");
       System.out.print("\nDiferença = "+(n1-n2));
      } else if (n1 < n2) {
       System.out.print("\nO 2º número é maior que o 1º.");
       System.out.print("\nDiferença = "+(n2-n1));
      } else {
       System.out.print("\nOs números são iguais");
        }
       }
}
