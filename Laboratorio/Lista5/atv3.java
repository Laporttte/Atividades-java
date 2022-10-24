package Laboratorio.Lista5;

import java.util.*;
public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num, cont=1,  soma=1, fat=1, i=1;
        System.out.print("Digite um número para o calculo da soma fatorial: ");
            num = sc.nextDouble();
            sc.close();
            while (cont<=num) {
                while(i<=cont)  { //calc fatorial
                    fat *= i;
                    soma += 1 / fat;
                    i++;
                }
                cont++;
        }
        System.out.print("Número fat: "+soma);
    }
}