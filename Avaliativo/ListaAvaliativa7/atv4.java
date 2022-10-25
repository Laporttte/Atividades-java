package Avaliativo.ListaAvaliativa7;
import java.util.*;
public class atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y=-2, x=-2, soma=0;
        int [] vetor = new int [8];

        System.out.print("Digite: \n");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }
        
        while((y<0 || y>7) && (x<0 || x>7)) {
        System.out.print("Digite y: (0-7)");
            y = sc.nextInt();
        System.out.print("Digite x: (0-7)");
            x = sc.nextInt();
        }
            sc.close();
        soma = vetor[y]+vetor[x];

        System.out.print("Soma = "+soma);
        
    }
}
/*
Faca um programa que leia um vetor de 8 posic ̧ ̃oes e, em seguida, leia tamb ́em dois valores X e Y
quaisquer correspondentes a duas posic ̧ ̃oes no vetor. Ao final seu programa dever ́a escrever a soma dos
valores encontrados nas respectivas posic ̧ ̃oes X e Y .
*/