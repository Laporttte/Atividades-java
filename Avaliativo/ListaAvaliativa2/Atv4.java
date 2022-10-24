package Avaliativo.ListaAvaliativa2;
import java.util.*;
public class Atv4 {
 public static void main(String [] args) {
  Scanner sc = new Scanner(System.in);
  float A, B, C;

  System.out.print("Valor A: ");
   A = sc.nextFloat();
  System.out.print("Valor B: ");
   B = sc.nextFloat();
  System.out.print("Valor C: ");
   C = sc.nextFloat();
   sc.close();

  if ((A<B+C) & (B<A+C) & (C<A+B)) {
   if (A==B & C == A) {
    System.out.print("\nÉ um triangulo equilátero");
   } else if ((A != B) & (B != C) & (A != C)) {
    System.out.print("\nÉ um triangulo escaleno");
   } else {
    System.out.print("É um triangulo isosceles");
   }
 } else {
    System.out.print("Não é um triangulo");
   }
   
}
}
