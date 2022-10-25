package Avaliativo.ListaAvaliativa7;
import java.util.*;
public class atv7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vetor = new int [10];
        int maior=0;

        System.out.print("Digite: \n");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();

            if (i==0)    { //le os numeros, idetifica e armazena no maior
                maior = vetor[i];
            }
            if (vetor[i]>maior)
                maior = vetor[i];
        }
            sc.close();
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]==maior)    {
                System.out.print("Maior = "+maior+"\nPosição: "+i);
            }
        }
    
    }
    
}
/*
Escreva um programa que leia 10 numeros inteiros e os armazene em um vetor. Imprima o vetor, o maior ´
elemento e a posic¸ao que ele se encontra. 
*/