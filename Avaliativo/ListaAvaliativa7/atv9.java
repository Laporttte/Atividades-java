package Avaliativo.ListaAvaliativa7;
import java.util.*;
public class atv9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] notas = new int [15];
        int soma=0;

        for (int i = 0; i < notas.length; i++) {
            notas[i] = sc.nextInt();
            soma+= notas[i];
        }
            sc.close();
        System.out.print("\nMédia= "+(soma/15));
    }
}
/*
Fac¸a um programa para ler a nota da prova de 15 alunos e armazene num vetor, calcule e imprima a
m´edia geral.
 */