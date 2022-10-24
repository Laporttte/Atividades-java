package Exemplos.vetores;
import java.util.*;
public class atv1 {
  /*   Exercicios com Vetores
1 Faca um Programa que leia um vetor de 5 némeros inteiros e mostre-os.




4, Faca um Programa que lela um vetor de 10 caracteres, e diga quantas consoantes
foram lidas. Imprima as consoantes.

5, Faca um Programa que leia 20 ntimeros inteiros e armazene-os num vetor.
‘Armazene os ntimeros pares no vetor PAR ¢ 0s niimeros IMPARES no vetor impar.
Imprima os trés vetores.

6. Faca um Programa que peca as quatro notas de 10 alunos, calcule e armazene
num vetor a média de cada aluno, imprima o nlimero de alunos com média maior
ou igual a 7.0.

7. Faca um Programa que leia um vetor de 5 niimeros inteiros, mostre a soma, a
multiplicago eos ntimeros,

8. Faca um Programa que peca a idade ea altura de 5 pessoas, armazene cada
informag3o no seu respectivo vetor. Imprima a idade ea altura na ordem inversa a
ordem lida.

9, Faca um Programa que lela um vetor A com 10 niimeros inteiros, calcule e mostre
a soma dos quadrados dos elementos do vetor.
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vet = new int[5];

        for(int i=0;i<vet.length;i++)    {
            System.out.print("Digite numero: ");
                vet[i] = sc.nextInt();
        }
        sc.close();
        for(int i=0;i<5;i++)    {
            System.out.print(" "+vet[i]);
        }
        
    }
    
}
