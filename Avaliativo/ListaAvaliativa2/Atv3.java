package Avaliativo.ListaAvaliativa2;
import java.util.*;
public class Atv3 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int num;

  System.out.print("Escreva o número inteiro: ");
   num = sc.nextInt();
   sc.close();

    if((num % 3 != 0 && num % 5 == 0) || (num % 3 == 0 && num % 5 !=0)) {
        if (num % 3 == 0) {
            System.out.print("O número digitado é divisivel apenas por 3 ");
    } else {
        System.out.print("O número digitado é divisível apenas por 5");
    }
    }
    
 }    
}
