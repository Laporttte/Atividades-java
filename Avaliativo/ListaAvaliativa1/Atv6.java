package Avaliativo.ListaAvaliativa1;
import java.util.*;
public class Atv6 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        double C, F;

        System.out.print("Temperatura em Fahrenheit: ");
            F = sc.nextDouble();
            sc.close();
        C = (F-32) * 5/9;

        System.out.printf("Em Celsius: "+ "%.2f",C);

    }
    
}
