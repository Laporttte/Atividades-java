package Avaliativo.ListaAvaliativa8;

import java.util.*;
public class atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vet = new int [10];
        int x;

        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
        }
        System.out.print("\nDigite x: ");
            x = sc.nextInt();
            sc.close();
        System.out.println("São multiplos de "+x);
        for (int i = 0; i < vet.length; i++) {
            if(vet[i]%x==0) {
                System.out.print(" "+vet[i]);
            }
        }
    }
}
/*
 Fac ̧a um programa que leia um vetor de 10 n ́umeros. Leia um n ́umero x. Conte os m ́ultiplos de um
n ́umero inteiro x num vetor e mostre-os na tela.
 */