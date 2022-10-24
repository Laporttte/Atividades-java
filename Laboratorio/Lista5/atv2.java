package Laboratorio.Lista5;

import java.util.*;
public class atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num, cont=2, soma=1;
        System.out.print("Digite um número para o calculo do número harmonico: ");
            num = sc.nextDouble();
            sc.close();
        while (cont<=num) {
            soma += 1 / cont;
            cont++;
        }
        System.out.print("Número harmonico: "+soma);
    }
}