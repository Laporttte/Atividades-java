package Avaliativo.ListaAvaliativa7;
import java.util.*;
public class atv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vetor = new int [10];
        int QuantPares=0;

        System.out.print("Digite: \n");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }
            sc.close();
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]%2==0) { //é par
                QuantPares++;
            }
        }
        System.out.print("O vetor teve "+QuantPares+" pares.");
    }
}
/*
5. Leia um vetor de 10 posic¸oes. Contar e escrever quantos valores pares ele possui. ˜
 */