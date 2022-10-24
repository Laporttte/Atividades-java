package Exemplos.ExerciciosMichele;

import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
    float vH, kmRodados, t, CombGasto, CombAuto;

    System.out.println("\nEscreva o tempo gasto na viagem em minutos; ");
        t = sc.nextFloat();
    System.out.println("Escreva a velocidade média em km/h: ");
        vH = sc.nextFloat();
    System.out.println("Escreva a quantidade de km rodados que o automovel faz por litro de combustivel:");
        CombAuto = sc.nextFloat();
        sc.close();
        t = t/60;   //Conversão para horas
        kmRodados = vH * t;
        CombGasto = kmRodados / CombAuto;
    System.out.println("O combustivel gasto foi: " + CombGasto);
    }
}
