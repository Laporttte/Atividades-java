package Avaliativo.ListaAvaliativa7;
import java.util.*;
public class atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vetor = new int [6];

        System.out.print("Digite: \n");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }
            sc.close();
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(" - "+vetor[i]);
        }

    }
}
/*
Crie um programa que lˆe 6 valores inteiros e, em seguida, mostre na tela os valores lidos. 
*/