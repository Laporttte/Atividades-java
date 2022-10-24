package Laboratorio.Lista5;

import java.util.*;
public class atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, cont;
        boolean hope=true;
        
        System.out.println("Digite o numero: ");
            n = sc.nextInt();
            cont=n;
            sc.close();
        while (hope) {
            if (cont%11==0) {
                System.out.print("O número "+cont+" é o 1º multiplo de 11 a partir de "+n+".");
                hope = false;
            }
            else if (cont%13==0) {
                System.out.print("O número "+cont+" é o 1º multiplo de 13 a partir de "+n+".");
                hope = false;
            }
            else if (cont%17==0) {
                System.out.print("O número "+cont+" é o 1º multiplo de 17 a partir de "+n+".");
                hope = false;
            }
            cont++;
        }
    }
}