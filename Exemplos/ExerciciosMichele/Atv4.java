package Exemplos.ExerciciosMichele;

import java.util.Scanner;

public class Atv4 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
    float H, M, S, ST;
        
    System.out.println("\nDigite as horas: ");
        H = sc.nextFloat();
    System.out.println("Digite os minutos: ");
        M = sc.nextFloat();
    System.out.println("Digite os segundos: ");
        S = sc.nextFloat();
        sc.close();
    H = H*3600;
    M = M*60;
    ST = H + M + S;
    System.out.println("O total de segundos é: " + ST + "\n");

    }
}
