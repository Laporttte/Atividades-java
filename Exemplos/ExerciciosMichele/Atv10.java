package Exemplos.ExerciciosMichele;

import java.util.Scanner;

public class Atv10 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int QuantCavalos;

        System.out.println("Quantos cavalos foram comprados?");
        QuantCavalos = sc.nextInt();
        System.out.println("Serão necessarias "+ (QuantCavalos*4) + " ferraduras.");
        sc.close();
    }
}
