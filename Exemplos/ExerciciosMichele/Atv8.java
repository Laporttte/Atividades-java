package Exemplos.ExerciciosMichele;

import java.util.Scanner;

public class Atv8 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        Float salario;

        System.out.println("Escreva o salário: ");
        salario = sc.nextFloat();
        sc.close();

        System.out.println("O salario registrado equivale a " + (salario/1212) + " salário(s).");

    }    
}
