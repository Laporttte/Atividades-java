package Avaliativo.ListaAvaliativa7;
import java.util.*;
public class atv6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vetor = new int [10];
        int maior=0, menor=0;

        System.out.print("Digite: \n");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }
            sc.close();
        for (int i = 0; i < vetor.length; i++) {
            if (i==0)    {
                maior = vetor[i];menor = vetor[i];
            }
            if (vetor[i]>maior)
                maior = vetor[i];
            if (vetor[i]<menor)
                menor = vetor[i];
        }
        System.out.print("Maior = "+maior+"\nMenor = "+menor);
    
    }
    
}
/*
Fac¸a um programa que receba do usuario um vetor com 10 posi ´ c¸oes. Em seguida dever ˜ a ser impresso o ´
maior e o menor elemento do vetor. 
*/
