package Avaliativo.ListaAvaliativa2;
import java.util.*;
 public class Atv5 {

 public static void main(String [] args) {

  Scanner sc = new Scanner(System.in);
  int idade, inss;

 System.out.print("Idade: ");
  idade = sc.nextInt();
 System.out.print("Tempo de serviço: ");
  inss = sc.nextInt();
  sc.close();

if(idade >= 65) {
 System.out.print("\nO contribuidor conseguirá aposentar.");
} else if (inss >= 30) {
 System.out.print("\nO contribuidor conseguirá aposentar.");
} else if (inss >= 25 && idade >=60) {
System.out.print("\nO contribuidor conseguirá aposentar.");
} else {
System.out.print("\nO contribuidor não ira aposentar.");
}
}
}
