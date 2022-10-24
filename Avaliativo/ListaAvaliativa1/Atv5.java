package Avaliativo.ListaAvaliativa1;
import java.util.*;
public class Atv5 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        double C, F;

        System.out.print("Temperatura em Celsius: ");
            C = sc.nextDouble();
            sc.close();
        F = C * (9.0/5.0)+32.0;

        System.out.printf("Em Fahrenheit: "+ "%.2f",F);

    }
    
}
