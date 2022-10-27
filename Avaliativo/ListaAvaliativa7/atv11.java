package Avaliativo.ListaAvaliativa7;
import java.util.*;

public class atv11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vetor = new int [5];
        int maior=0, menor=0, media=0;

        System.out.print("Escreva: \n");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
            if(i==0) {
                maior=vetor[i]; menor=vetor[i];
            }
            if(vetor[i]>maior)
                maior=vetor[i];
            if(menor>vetor[i])
                menor=vetor[i];

            media+=vetor[i];
        }
        sc.close();
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(" "+vetor[i]);
        }
            System.out.print("\nMaior: "+maior+"\nMenor: "+menor+"\nMedia: "+(media/5));
    }
}
/*
 Fazer um programa para ler 5 valores e, em seguida, mostrar todos os valores lidos juntamente com o
maior, o menor e a m´edia dos valores
 */