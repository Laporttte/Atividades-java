package Laboratorio.Lista2;
import java.util.*;
public class Atv1 {

public static void main (String[] args) {         
    Scanner sc = new Scanner(System.in);
    int A, B, C, soma;

    System.out.print("Escreva o valor de A: ");
        A = sc.nextInt();
    System.out.print("Escreva o valor de B: ");
        B = sc.nextInt();
    System.out.print("Escreva o valor de C: ");
        C = sc.nextInt();
        sc.close();
        soma=A+B;
    if (soma<C)    {
        System.out.print("O valor de A+B é menor que C");

    } else {
        System.out.print("A soma A+B não é menor do que C");
    }
    }
}
