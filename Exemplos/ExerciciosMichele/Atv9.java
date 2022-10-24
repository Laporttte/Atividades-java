package Exemplos.ExerciciosMichele;

import java.util.Scanner;

public class Atv9 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        Float VT, VG;
        
        System.out.println("Qual o valor total gasto? ");
            VT = sc.nextFloat();
            sc.close();
            VG = VT/10;
        System.out.println("\n\t\t---Recibo---\t\t");
        System.out.println("\nO valor total foi: " + VT);
        System.out.println("O valor da gorgeta foi: " + VG);
        System.out.println("\n\t\t---------\t\t");

    }
}