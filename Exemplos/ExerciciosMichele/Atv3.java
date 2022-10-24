package Exemplos.ExerciciosMichele;

import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
    double P, V, T;
    double M;

    System.out.println("\nInforme a pressão do pneu:");
        P = sc.nextDouble();
    System.out.println("\nInforme o volume do pneu:");
        V = sc.nextDouble();
    System.out.println("\nInforme a temperatura do pneu:");
        T = sc.nextDouble();
        sc.close();
    M = (P*V)/(0.37 * (T+460));
    System.out.println("\nA massa de ar do pneu é: " + M);

    }
}

