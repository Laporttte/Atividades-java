package Avaliativo.ListaAvaliativa8;
import java.util.*;

public class atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] vet = new double [5];
        int cod;

        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
        }

        System.out.println("Digite o código: ");
            cod = sc.nextInt();
            sc.close();

        if (cod==1) { //vetor na posicao correta - for 0 - limite
            for (int i = 0; i < vet.length; i++) {
                System.out.print(" "+vet[i]);
            }
        } else if (cod==2) { //vetor na posicao incorreta - for limte - 0
            for (int i = vet.length-1; i >= 0; i--) {
                System.out.print(" "+vet[i]);
            }
        } else if (cod==0) {

        } else {
            System.out.print("código invalido.");
        }
    }
}
/*
Fac ̧a um programa que leia um vetor de 5 posic ̧ ̃oes para n ́umeros reais e, depois, um c ́odigo inteiro. Se o
c ́odigo for zero, finalize o programa; se for 1, mostre o vetor na ordem direta; se for 2, mostre o vetor na
ordem inversa. Caso, o c ́odigo for diferente de 1 e 2 escreva uma mensagem informando que o c ́odigo  ́e
inv ́alido.
 */
