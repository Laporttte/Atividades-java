package Laboratorio.Lista2;
import java.util.*;
public class Atv4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
            int A, B, C;
            
            System.out.print("Escreva o valor de A: ");
                A = sc.nextInt();
            System.out.print("Escreva o valor de B: ");
                B = sc.nextInt();
                sc.close();
            
            if (A == B) {
                C = A+B;
            } else {
                C = A*B;
            }
            System.out.print("O valor de C é: " + C);
        }
    }
