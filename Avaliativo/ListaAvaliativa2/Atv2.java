package Avaliativo.ListaAvaliativa2;
import java.util.*;
public class Atv2 {
 public static void main(String [] args) {
  Scanner sc = new Scanner(System.in);
  float bm, BM, A;

  System.out.print("Base maior: ");
   BM = sc.nextFloat();
  System.out.print("Base menor: ");
   bm = sc.nextFloat();
   sc.close();

 if (bm <= 0 || BM <= 0) {
   System.out.print("\nOs números apresentados são iguais ou menores que zero!");
 } else {
  A = ((BM+bm)*2)/2;
  System.out.print("\nA área é: "+A);
   }
   
 }
}