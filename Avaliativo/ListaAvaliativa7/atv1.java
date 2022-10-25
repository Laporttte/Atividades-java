package Avaliativo.ListaAvaliativa7;
public class atv1 {
    public static void main(String[] args) {
        int soma=0, A[] = {1,0,5,-2,-5,7};

        soma = A[0]+A[1]+A[5];
        System.out.print("Soma: "+soma);

        A[4] = 100;
        
        for (int i = 0; i < A.length; i++) {
            System.out.print("\n"+A[i]);
        }
    }
}
/*
1. Faca um programa que possua um vetor denominado A que armazene 6 n ́umeros inteiros. O programa
deve executar os seguintes passos:
• Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
• Armazene em uma vari ́avel inteira (simples) a soma entre os valores das posic ̧ ̃oes A[0], A[1] e A[5]
do vetor e mostre na tela esta soma.
• Modifique o vetor na posic ̧ ̃ao 4, atribuindo a esta posic ̧ ̃ao o valor 100.
• Mostre na tela cada valor do vetor A, um em cada linha.
 */
