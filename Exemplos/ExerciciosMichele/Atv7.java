package Exemplos.ExerciciosMichele;

import java.util.Scanner;

public class Atv7 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
    
    int num1=0, num2=0, num3=0, num4=0, media;
        
    System.out.println("\nEscreva os números para o calculo da média ponderada\n");

        System.out.println("Escreva o número 1: ");
            num1 = sc.nextInt();
        System.out.println("Escreva o número 2: ");
            num2 = sc.nextInt();
        System.out.println("Escreva o número 3: ");
            num3 = sc.nextInt();
        System.out.println("Escreva o número 4: ");
            num4 = sc.nextInt();
            sc.close();
        media = (((num1*2) + (num2*1) + (num3*3) + (num4*4))/10);
        System.out.println("A média foi: " + media);

        }
    }
