package Avaliativo.ListaAvaliativa7;
import java.util.*;
public class atv12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vetor = new int [5];
        int pMaior=0, maior=0, menor=0, pMenor=0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();

            if(i==0) {
                maior=vetor[i]; menor=vetor[i];
            }

            if(vetor[i]>maior)  {
                maior=vetor[i];
                pMaior = i; }
            if(menor>vetor[i])  {
                menor=vetor[i];
                pMenor = i; }
        }
        sc.close();
        System.out.print("Posicão => maior: "+pMaior+"  menor: "+pMenor);
    }
}
/*
 azer um programa para ler 5 valores e, em seguida, mostrar a posic¸ao onde se encontram o maior e o ˜
menor valor
 */